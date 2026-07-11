package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractC1811v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f50588a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f50589b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collection f50590c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f50591d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f50592e = null;

    /* JADX INFO: renamed from: com.applovin.impl.v$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f50593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50594b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private EnumC0713a f50595c = EnumC0713a.NOT_SET;

        /* JADX INFO: renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        public enum EnumC0713a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f50600a;

            public String b() {
                return this.f50600a;
            }

            EnumC0713a(String str) {
                this.f50600a = str;
            }
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            EnumC0713a enumC0713aB = b();
            EnumC0713a enumC0713aB2 = aVar.b();
            return enumC0713aB != null ? enumC0713aB.equals(enumC0713aB2) : enumC0713aB2 == null;
        }

        public void a(boolean z2) {
            this.f50593a = z2;
        }

        public EnumC0713a b() {
            return this.f50595c;
        }

        public boolean c() {
            return this.f50593a;
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(String str) {
            this.f50594b = str;
        }

        public int hashCode() {
            int i2;
            int iHashCode;
            if (c()) {
                i2 = 79;
            } else {
                i2 = 97;
            }
            String strA = a();
            int i3 = (i2 + 59) * 59;
            int iHashCode2 = 43;
            if (strA == null) {
                iHashCode = 43;
            } else {
                iHashCode = strA.hashCode();
            }
            int i5 = i3 + iHashCode;
            EnumC0713a enumC0713aB = b();
            int i7 = i5 * 59;
            if (enumC0713aB != null) {
                iHashCode2 = enumC0713aB.hashCode();
            }
            return i7 + iHashCode2;
        }

        public void a(EnumC0713a enumC0713a) {
            this.f50595c = enumC0713a;
        }

        public String a() {
            return this.f50594b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        n7.a();
        Object obj = f50589b;
        synchronized (obj) {
            try {
                if (f50591d) {
                    return f50592e;
                }
                Collection collection = f50590c;
                boolean zIsEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (zIsEmpty) {
                    a aVarC = c(context);
                    synchronized (obj) {
                        f50591d = true;
                        f50592e = aVarC;
                        hashSet = new HashSet(collection);
                        collection.clear();
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((CountDownLatch) it.next()).countDown();
                    }
                }
                try {
                    if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                        C1804o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                    }
                } catch (InterruptedException e2) {
                    C1804o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e2);
                }
                synchronized (f50589b) {
                    aVar = f50592e;
                }
                return aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f50588a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z2);
                aVar.a(z2 ? a.EnumC0713a.ON : a.EnumC0713a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e2) {
                C1804o.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e2);
            } catch (Throwable th) {
                C1804o.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f50588a = false;
        return null;
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        if (aVarCollectGoogleAdvertisingInfo == null) {
            return new a();
        }
        return aVarCollectGoogleAdvertisingInfo;
    }

    @Nullable
    private static a collectGoogleAdvertisingInfo(Context context) {
        a.EnumC0713a enumC0713a;
        n7.a();
        if (a()) {
            try {
                a aVar = new a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.a(zIsLimitAdTrackingEnabled);
                if (zIsLimitAdTrackingEnabled) {
                    enumC0713a = a.EnumC0713a.ON;
                } else {
                    enumC0713a = a.EnumC0713a.OFF;
                }
                aVar.a(enumC0713a);
                aVar.a(advertisingIdInfo.getId());
                return aVar;
            } catch (Throwable th) {
                if (!AppLovinSdkUtils.isFireOS(context)) {
                    C1804o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
                    return null;
                }
                return null;
            }
        }
        if (!AppLovinSdkUtils.isFireOS(context)) {
            C1804o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        return null;
    }

    public static boolean a() {
        return n7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
