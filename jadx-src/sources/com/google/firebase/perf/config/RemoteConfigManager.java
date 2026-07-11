package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, N67.o> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final r cache;
    private final Executor executor;

    @Nullable
    private com.google.firebase.remoteconfig.j firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private oSp.n firebaseRemoteConfigProvider;
    private static final yMa.j logger = yMa.j.O();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    private RemoteConfigManager() {
        this(r.O(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(25000)) + 5000, getInitialStartupMillis());
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j2) {
        return j2 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j2) {
        return j2 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    public O2.CN3 getBoolean(String str) {
        if (str == null) {
            logger.n("The key to get Remote Config boolean value is null.");
            return O2.CN3.n();
        }
        N67.o remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return O2.CN3.O(Boolean.valueOf(remoteConfigValue.asBoolean()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.rl("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return O2.CN3.n();
    }

    public O2.CN3 getDouble(String str) {
        if (str == null) {
            logger.n("The key to get Remote Config double value is null.");
            return O2.CN3.n();
        }
        N67.o remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return O2.CN3.O(Double.valueOf(remoteConfigValue.asDouble()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.rl("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return O2.CN3.n();
    }

    public O2.CN3 getLong(String str) {
        if (str == null) {
            logger.n("The key to get Remote Config long value is null.");
            return O2.CN3.n();
        }
        N67.o remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return O2.CN3.O(Long.valueOf(remoteConfigValue.asLong()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.rl("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return O2.CN3.n();
    }

    public O2.CN3 getString(String str) {
        if (str == null) {
            logger.n("The key to get Remote Config String value is null.");
            return O2.CN3.n();
        }
        N67.o remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? O2.CN3.O(remoteConfigValue.asString()) : O2.CN3.n();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        oSp.n nVar;
        com.google.firebase.remoteconfig.w6 w6Var;
        if (this.firebaseRemoteConfig == null && (nVar = this.firebaseRemoteConfigProvider) != null && (w6Var = (com.google.firebase.remoteconfig.w6) nVar.get()) != null) {
            this.firebaseRemoteConfig = w6Var.O(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.j jVar = this.firebaseRemoteConfig;
        return jVar == null || jVar.qie().n() == 1 || this.firebaseRemoteConfig.qie().n() == 2;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable oSp.n nVar) {
        this.firebaseRemoteConfigProvider = nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public void syncConfigValues(Map<String, N67.o> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        Ml mlO = Ml.O();
        N67.o oVar = this.allRcConfigMap.get(mlO.t());
        if (oVar == null) {
            logger.n("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.qie(mlO.n(), oVar.asBoolean());
        } catch (Exception unused) {
            logger.n("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    @VisibleForTesting
    static long getInitialStartupMillis() {
        com.google.firebase.Pl pl;
        try {
            pl = (com.google.firebase.Pl) com.google.firebase.Wre.az().mUb(com.google.firebase.Pl.class);
        } catch (IllegalStateException unused) {
            logger.n("Unable to get StartupTime instance.");
            pl = null;
        }
        if (pl != null) {
            return pl.t();
        }
        return System.currentTimeMillis();
    }

    private N67.o getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            N67.o oVar = this.allRcConfigMap.get(str);
            if (oVar.getSource() == 2) {
                logger.rl("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", oVar.asString(), str);
                return oVar;
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ void n(RemoteConfigManager remoteConfigManager, Exception exc) {
        remoteConfigManager.getClass();
        logger.gh("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        remoteConfigManager.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.mUb().addOnSuccessListener(this.executor, new OnSuccessListener() { // from class: com.google.firebase.perf.config.SPz
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RemoteConfigManager remoteConfigManager = this.f60597n;
                remoteConfigManager.syncConfigValues(remoteConfigManager.firebaseRemoteConfig.gh());
            }
        }).addOnFailureListener(this.executor, new OnFailureListener() { // from class: com.google.firebase.perf.config.ci
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RemoteConfigManager.n(this.f60602n, exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.gh());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    @VisibleForTesting
    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t3) {
        N67.o remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t3 instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.asBoolean());
                }
                if (t3 instanceof Double) {
                    return (T) Double.valueOf(remoteConfigValue.asDouble());
                }
                if (!(t3 instanceof Long) && !(t3 instanceof Integer)) {
                    if (t3 instanceof String) {
                        return (T) remoteConfigValue.asString();
                    }
                    T t4 = (T) remoteConfigValue.asString();
                    try {
                        logger.rl("No matching type found for the defaultValue: '%s', using String.", t3);
                        return t4;
                    } catch (IllegalArgumentException unused) {
                        t3 = t4;
                        if (!remoteConfigValue.asString().isEmpty()) {
                            logger.rl("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                        }
                        return t3;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.asLong());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t3;
    }

    @VisibleForTesting
    RemoteConfigManager(r rVar, Executor executor, com.google.firebase.remoteconfig.j jVar, long j2, long j3) {
        ConcurrentHashMap<String, N67.o> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = rVar;
        this.executor = executor;
        this.firebaseRemoteConfig = jVar;
        if (jVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>((Map<? extends String, ? extends N67.o>) jVar.gh());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j3;
        this.appStartConfigFetchDelayInMs = j2;
    }
}
