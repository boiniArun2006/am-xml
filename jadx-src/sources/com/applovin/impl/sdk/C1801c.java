package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alightcreative.time.Kw.znsSxz;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1797r6;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.o7;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdType;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C1801c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f50127b = new File(C1802k.o().getFilesDir(), "al/persisted-ads");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50128a;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.c$a */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class a implements q4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f50129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdType f50130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f50131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f50132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f50133e;

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
            if (!aVar.a(this)) {
                return false;
            }
            String strE = e();
            String strE2 = aVar.e();
            if (strE != null ? !strE.equals(strE2) : strE2 != null) {
                return false;
            }
            AppLovinAdType appLovinAdTypeF = f();
            AppLovinAdType appLovinAdTypeF2 = aVar.f();
            return appLovinAdTypeF != null ? appLovinAdTypeF.equals(appLovinAdTypeF2) : appLovinAdTypeF2 == null;
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar) {
            return a(bVar, 0L, 0L);
        }

        public long b() {
            return this.f50133e;
        }

        public long c() {
            return this.f50132d;
        }

        public String d() {
            return this.f50129a + "_" + this.f50130b;
        }

        public String e() {
            return this.f50129a;
        }

        public AppLovinAdType f() {
            return this.f50130b;
        }

        public boolean g() {
            return this.f50131c;
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + e() + ", type=" + f() + ", isAdServerAd=" + g() + ", expiryTimeMillis=" + c() + ", appLaunchTimestamp=" + b() + ")";
        }

        public a(String str, AppLovinAdType appLovinAdType, boolean z2, long j2, long j3) {
            this.f50129a = str;
            this.f50130b = appLovinAdType;
            this.f50131c = z2;
            this.f50132d = j2;
            this.f50133e = j3;
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar, long j2, long j3) {
            if (bVar == null) {
                return null;
            }
            return new a(StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, SystemClock.elapsedRealtime() + j2, j3);
        }

        public int hashCode() {
            int iHashCode;
            String strE = e();
            int iHashCode2 = 43;
            if (strE == null) {
                iHashCode = 43;
            } else {
                iHashCode = strE.hashCode();
            }
            AppLovinAdType appLovinAdTypeF = f();
            int i2 = (iHashCode + 59) * 59;
            if (appLovinAdTypeF != null) {
                iHashCode2 = appLovinAdTypeF.hashCode();
            }
            return i2 + iHashCode2;
        }

        public static a a(JSONObject jSONObject, C1802k c1802k) {
            String string = JsonUtils.getString(jSONObject, "id", "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j2 = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j3 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j2, j3);
        }

        @Override // com.applovin.impl.q4
        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "id", this.f50129a);
            JsonUtils.putString(jSONObject, "type", this.f50130b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f50131c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f50132d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f50133e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.c$b */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface b {
        void a(a aVar);
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface InterfaceC0710c {
        void a(com.applovin.impl.sdk.ad.b bVar, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        a aVarA = a.a(bVar, ((Long) this.f50128a.a(x4.Z0)).longValue(), C1802k.n());
        File fileA = a(aVarA);
        if (fileA == null) {
            a("Could not persist incompatible ad", bVar, bVar2);
            return;
        }
        try {
            JSONObject jSONObjectA = bVar.a();
            if (jSONObjectA == null) {
                a("Could not serialize ad for persistence", bVar, bVar2);
                return;
            }
            if (this.f50128a.G().a((InputStream) new ByteArrayInputStream(jSONObjectA.toString().getBytes(com.google.android.exoplayer2.C.UTF8_NAME)), fileA, true)) {
                a(aVarA, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (Throwable th) {
            a("Ad could not be persisted", bVar, bVar2);
            this.f50128a.D().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(final com.applovin.impl.sdk.ad.b bVar, final b bVar2) {
        if (b()) {
            this.f50128a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50128a, "persistAd", new Runnable() { // from class: com.applovin.impl.sdk.qz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50464n.a(bVar, bVar2);
                }
            }), d6.b.CACHING);
        } else {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        }
    }

    public C1801c(C1802k c1802k) {
        this.f50128a = c1802k;
    }

    private boolean b() {
        File file = f50127b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public void b(a aVar) {
        File fileA = a(aVar);
        if (fileA != null) {
            fileA.delete();
        }
    }

    public void a(final a aVar, final InterfaceC0710c interfaceC0710c) {
        final File fileA = a(aVar);
        if (fileA != null && fileA.exists()) {
            this.f50128a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50128a, "retrievePersistedAd", new Runnable() { // from class: com.applovin.impl.sdk.Pl
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f50017n.a(fileA, interfaceC0710c, aVar);
                }
            }), d6.b.OTHER);
        } else {
            interfaceC0710c.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, InterfaceC0710c interfaceC0710c, a aVar) throws Throwable {
        com.applovin.impl.sdk.ad.b bVarA;
        String strF = this.f50128a.G().f(file);
        if (strF == null) {
            interfaceC0710c.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strF, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.g()) {
                bVarA = com.applovin.impl.sdk.ad.a.a(jSONObjectJsonObjectFromJsonString, this.f50128a);
            } else {
                bVarA = o7.a(jSONObjectJsonObjectFromJsonString, this.f50128a);
            }
            if (bVarA == null) {
                interfaceC0710c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                interfaceC0710c.a(bVarA, null);
            }
        } catch (Throwable th) {
            interfaceC0710c.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f50128a.D().a("AdPersistenceFileService", th, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private File a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f50127b.getAbsolutePath() + znsSxz.xqMvummVJSjrHWg + aVar.d());
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f50128a.O();
        if (C1804o.a()) {
            this.f50128a.O().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.f50128a.g().a(d2.f48269U, bVar);
    }

    private void a(String str, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f50128a.O();
        if (C1804o.a()) {
            this.f50128a.O().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        Map mapA = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f50128a.g().d(d2.f48270V, mapA);
    }

    public void a(List list) {
        File[] fileArrListFiles = f50127b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z2 = false;
        for (File file : fileArrListFiles) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).d().equals(file.getName())) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z2) {
                file.delete();
            }
        }
    }

    public void a() {
        File[] fileArrListFiles;
        File file = f50127b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }
}
