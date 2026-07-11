package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.safedk.android.SafeDK;
import com.safedk.android.a.g;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistableBase;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class FileUploadManager {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f61540A = "upload_url";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f61541B = "url";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f61542C = "query_params";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f61543D = "return_params";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f61544E = "base_url";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f61545F = "attributes";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final String f61546G = "bucket";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final String f61547H = "x-amz-date";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final String f61548I = "signature";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final String f61549J = "AWSAccessKeyId";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final String f61550K = "acl";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final String f61551L = "x-amz-server-side-encryption";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String f61552M = "x-amz-algorithm";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String f61553N = "x-amz-credential";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f61554O = "policy";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final String f61555P = "s3_key_prefix";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final String f61556Q = "image_id";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final String f61557R = "Content-Type";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f61558S = "type";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String f61559T = "sha1";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static FileUploadManager f61560U = null;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static LimitedConcurrentHashMap<String, FileUploadData> f61561V = null;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static LimitedConcurrentHashMap<String, HashSet<FileUploadData>> f61562W = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61563a = "original_url";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f61564b = "resolved_url";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f61565c = "fingerprint";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f61566d = "sdk_uuid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f61567e = "impression_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61568f = "package";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f61569g = "id";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f61570h = "file";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f61571i = "files";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f61572j = "action";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f61573k = "id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f61574l = "upload";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f61575m = "discard";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f61576n = 200;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f61577o = ".snk";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static String f61578p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f61579q = "FileUploadManager";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f61580r = "images_to_upload";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f61581s = "images_to_discard";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f61582t = "s3_access_tokens";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f61583u = "resolve_urls";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f61584v = "url";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f61585w = "key_prefix";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f61586x = "key";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f61587y = "gcs_params";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f61588z = "headers";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final ScheduledExecutorService f61589X = Executors.newScheduledThreadPool(1);

    private FileUploadManager() {
        b();
        int iA = com.safedk.android.internal.d.A();
        f61561V = new LimitedConcurrentHashMap<>(iA);
        f61562W = new LimitedConcurrentHashMap<>(iA);
        f61578p = SafeDK.getInstance().ae() + "Files" + File.separator;
        d();
        e();
    }

    private void b() {
        AppLovinBridge.registerListener(AppLovinBridge.f61284b, new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.FileUploadManager.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(FileUploadManager.f61579q, "Response received");
                FileUploadManager.this.b(bundle);
            }
        });
    }

    private a a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Logger.printFullVerboseLog(f61579q, "Extract AWS upload parameters from response body: ", bundle);
        if (!bundle.containsKey(f61582t)) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
        } else {
            Bundle bundle2 = bundle.getBundle(f61582t);
            Logger.d(f61579q, "s3AccessTokens=", bundle2.toString());
            String string = bundle2.getString(f61544E);
            Bundle bundle3 = bundle2.getBundle(f61545F);
            String string2 = bundle3.getString(f61546G);
            String string3 = bundle3.getString(f61547H);
            String string4 = bundle3.getString(f61548I);
            String string5 = bundle3.getString(f61549J);
            String string6 = bundle3.getString(f61550K);
            String string7 = bundle3.getString(f61551L);
            String string8 = bundle3.getString(f61552M);
            String string9 = bundle3.getString(f61553N);
            String string10 = bundle3.getString(f61554O);
            String string11 = bundle3.getString("Content-Type");
            Logger.d(f61579q, "s3 credentials collected");
            str11 = string11;
            str3 = string2;
            str8 = string3;
            str2 = string4;
            str4 = string;
            str5 = string5;
            str6 = string6;
            str9 = string7;
            str7 = string8;
            str10 = string9;
            str = string10;
        }
        return new a(str5, str, str2, null, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bundle bundle) {
        b bVar;
        try {
            Logger.d(f61579q, "Response from server: ", bundle.toString());
            ArrayList<c> arrayList = new ArrayList();
            if (bundle.containsKey(f61580r)) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(f61580r);
                Logger.d(f61579q, "imagesToUploadArrayList=", stringArrayList.toString());
                Iterator<String> it = stringArrayList.iterator();
                a aVarA = null;
                while (it.hasNext()) {
                    Bundle bundle2 = (Bundle) it.next();
                    String string = bundle2.getString(f61565c);
                    String string2 = bundle2.getString("image_id");
                    if (bundle2.containsKey(f61587y)) {
                        String string3 = bundle2.getString(f61585w);
                        String string4 = bundle2.getString(f61586x);
                        Bundle bundle3 = bundle2.getBundle(f61587y);
                        bVar = new b(string3, string4, bundle3.getBundle(f61588z), bundle3.getString(f61540A));
                    } else if (aVarA != null) {
                        bVar = null;
                    } else {
                        aVarA = a(bundle);
                        bVar = null;
                    }
                    if (aVarA != null) {
                        String string5 = bundle2.getString(f61555P);
                        aVarA.a(string5);
                        Logger.d(f61579q, "imagesToUploadBundle item : fingerprint=", string, ", imageId=", string2, ", s3KeyPrefix=", string5);
                    }
                    com.safedk.android.analytics.brandsafety.c cVarK = com.safedk.android.analytics.brandsafety.b.k(string2);
                    if (cVarK != null) {
                        Logger.d(f61579q, "Image for upload added : image id ", string2);
                        arrayList.add(new c(cVarK.f61834p, string2, string, bVar, aVarA));
                    }
                }
                for (c cVar : arrayList) {
                    if (cVar.f61626a != null) {
                        com.safedk.android.analytics.brandsafety.a aVarA2 = SafeDK.getInstance().a(cVar.f61626a);
                        if (aVarA2 != null) {
                            Logger.d(f61579q, "Executing image upload request for ad type ", cVar.f61626a.name());
                            aVarA2.a(cVar.f61630e, cVar.f61629d, cVar.f61627b, cVar.f61628c);
                        } else {
                            Logger.d(f61579q, "Upload: finder not found for ad type ", cVar.f61626a.name());
                        }
                    } else {
                        Logger.d(f61579q, "Upload: finder not found for ad type null");
                    }
                }
            }
            if (bundle.containsKey(f61583u)) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(f61583u);
                Logger.d(f61579q, "clickUrlsToResolveArrayList=", stringArrayList2.toString());
                Iterator<String> it2 = stringArrayList2.iterator();
                while (it2.hasNext()) {
                    Bundle bundle4 = (Bundle) it2.next();
                    String string6 = bundle4.getString(f61565c);
                    String string7 = bundle4.getString("sdk_uuid");
                    String string8 = bundle4.getString("impression_id");
                    String string9 = bundle4.getString("url");
                    Logger.d(f61579q, "clickUrlsToResolveBundle item : fingerprint=", string6, ", url=", string9);
                    if (string6 != null && string9 != null) {
                        i.a().a(string9, string6, string7, string8);
                    } else {
                        Logger.d(f61579q, "fingerprint and url are null, skipping");
                    }
                }
            }
            if (bundle.containsKey(f61581s)) {
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList(f61581s);
                Logger.d(f61579q, "Images to discard : ", stringArrayList3.toString());
                for (String str : stringArrayList3) {
                    com.safedk.android.analytics.brandsafety.c cVarK2 = com.safedk.android.analytics.brandsafety.b.k(str);
                    if (cVarK2 != null) {
                        com.safedk.android.analytics.brandsafety.a aVarA3 = SafeDK.getInstance().a(cVarK2.f61834p);
                        if (aVarA3 != null) {
                            Logger.d(f61579q, "Executing image discard request for hash ", str);
                            aVarA3.g(str);
                        } else {
                            Logger.d(f61579q, "Discard : finder not found for image id ", str);
                        }
                    }
                }
            }
            if (bundle.isEmpty() || !bundle.containsKey(f61580r)) {
                c();
            }
            if (bundle.containsKey(f61571i)) {
                c(bundle);
                e();
            }
        } catch (Throwable th) {
            Logger.e(f61579q, "Failed to handle response from server", th);
            new CrashReporter().caughtException(th);
        }
    }

    private void c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f61571i);
        Logger.d(f61579q, "fileArrayList=", stringArrayList.toString());
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = (Bundle) it.next();
            String string = bundle2.getString("id", null);
            String string2 = bundle2.getString(f61572j);
            if (string != null && string2 != null) {
                if (string2.equals(QiDPjiOCZHDS.xvXIgOWOZ)) {
                    Logger.d(f61579q, "edge server responded to upload the file id: ", string);
                    if (bundle2.containsKey(f61587y)) {
                        a(bundle2, string);
                    }
                } else if (string2.equals(f61575m)) {
                    Logger.d(f61579q, "edge server responded to discard the file id: ", string);
                    c(string);
                } else {
                    Logger.d(f61579q, "edge server responded with an unknown action value or it does not exist: ", string2);
                }
            }
        }
    }

    private void a(Bundle bundle, String str) {
        String str2;
        Bundle bundle2;
        Bundle bundle3 = bundle.getBundle(f61587y);
        Bundle bundle4 = bundle3.getBundle(f61588z);
        String string = bundle3.getString("url");
        String string2 = bundle3.getString(f61542C);
        if (string != null && string2 != null) {
            str2 = string + "?" + string2;
        } else {
            str2 = null;
        }
        if (!bundle.containsKey(f61543D)) {
            bundle2 = null;
        } else {
            bundle2 = bundle.getBundle(f61543D);
        }
        a(str, new b(null, null, bundle4, str2), string, bundle2);
    }

    private void a(final String str, final b bVar, final String str2, final Bundle bundle) {
        this.f61589X.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.FileUploadManager.2
            @Override // java.lang.Runnable
            public void run() {
                FileUploadManager.this.a(str, bVar, str2, bundle, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final b bVar, final String str2, final Bundle bundle, final int i2) {
        g.a aVarB;
        String string;
        FileUploadData fileUploadData = f61561V.get(str);
        if (fileUploadData == null) {
            Logger.d(f61579q, "File upload - did not find file with id: ", str);
            return;
        }
        if (fileUploadData.d() == null || fileUploadData.d().length() == 0) {
            Logger.d(f61579q, "File upload - file with id: ", str, " is empty");
            return;
        }
        Logger.d(f61579q, "Uploading file Upload Data ", fileUploadData, " to server, ms, isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (bVar != null) {
            try {
                aVarB = new com.safedk.android.a.c(fileUploadData.c(), SafeDK.getInstance().L(), bVar, fileUploadData.d()).b();
            } catch (IOException e2) {
                if (i2 >= 2) {
                    Logger.d(f61579q, "IOException when uploading file ", fileUploadData.c(), " : ", e2.getMessage(), e2);
                    return;
                }
                int i3 = com.safedk.android.a.g.f61258h[i2];
                Logger.d(f61579q, "IOException when uploading file, next retry in ", Integer.valueOf(i3), " ms, file: ", fileUploadData.c());
                this.f61589X.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.FileUploadManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        FileUploadManager.this.a(str, bVar, str2, bundle, i2 + 1);
                    }
                }, i3, TimeUnit.MILLISECONDS);
                return;
            } catch (Throwable th) {
                Logger.e(f61579q, "Failed to upload file ", fileUploadData.c(), " : ", th.getMessage(), th);
                aVarB = null;
            }
        } else {
            aVarB = null;
        }
        if (bundle != null && bundle.containsKey(f61565c)) {
            string = bundle.getString(f61565c);
            bundle.remove(f61565c);
        } else {
            string = null;
        }
        if (aVarB != null && aVarB.b() == 200) {
            String strA = aVarB.a();
            Logger.d(f61579q, "Upload file succeeded: ", strA, "gcsResponse: ", aVarB);
            if (strA != null && !strA.isEmpty()) {
                Bundle bundle2 = new Bundle();
                Bundle bundle3 = new Bundle();
                try {
                    bundle3.putString("url", str2);
                    bundle3.putString("id", fileUploadData.a());
                    bundle3.putString("type", fileUploadData.b());
                    bundle3.putString(f61559T, fileUploadData.c());
                    if (string != null) {
                        bundle3.putString(f61565c, string);
                    }
                    if (bundle != null) {
                        Logger.d(f61579q, "Upload file - entering return params into the file data to return: ", bundle);
                        bundle3.putAll(bundle);
                    }
                    bundle2.putBundle(f61570h, bundle3);
                } catch (Throwable th2) {
                    Logger.e(f61579q, th2.getMessage(), th2);
                    new CrashReporter().caughtException(th2);
                }
                Logger.d(f61579q, "going to report back to edge: ", bundle2);
                g.b(bundle2);
            }
        } else if (aVarB != null && aVarB.b() != 200) {
            Logger.d(f61579q, "upload file failed, returned code is: ", Integer.valueOf(aVarB.b()), " for fingerprint: ", string);
        } else {
            Logger.d(f61579q, "upload file failed, gcsResponse is null, fingerprint = ", string);
        }
        c(str);
    }

    private void c() {
        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
        while (it.hasNext()) {
            it.next().b((k) null);
        }
    }

    public static FileUploadManager a() {
        if (f61560U == null) {
            f61560U = new FileUploadManager();
        }
        return f61560U;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f61622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f61623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Bundle f61624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f61625d;

        public b(String str, String str2, Bundle bundle, String str3) {
            this.f61622a = str;
            this.f61623b = str2;
            this.f61624c = bundle;
            this.f61625d = str3;
            Logger.d(FileUploadManager.f61579q, "GcsUploadParams ctor, keyPrefix=", str, ", key=", str2, ", headers=", bundle, ", uploadUrl=", str3);
        }

        public String a() {
            return this.f61622a;
        }

        public String b() {
            return this.f61623b;
        }

        public Bundle c() {
            return this.f61624c;
        }

        public String d() {
            return this.f61625d;
        }

        public String toString() {
            return "keyPrefix=" + this.f61622a + ", key = " + this.f61623b + ", headers=" + this.f61624c + ", uploadUrl=" + this.f61625d;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f61609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f61610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f61611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f61612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f61613e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f61614f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f61615g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f61616h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f61617i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f61618j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f61619k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f61620l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        String f61621m;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.f61609a = str;
            this.f61610b = str2;
            this.f61611c = str3;
            this.f61612d = str4;
            this.f61613e = str5;
            this.f61614f = str6;
            this.f61615g = str7;
            this.f61616h = str8;
            this.f61617i = str9;
            this.f61618j = str10;
            this.f61619k = str11;
            this.f61620l = str12;
            this.f61621m = str13;
            Logger.d(FileUploadManager.f61579q, "AwsUploadParams ctor, awsAccessKey=", str, ", keyPrefix=", str4, ", bucket=", str5);
        }

        public String a() {
            return this.f61609a;
        }

        public String b() {
            return this.f61610b;
        }

        public String c() {
            return this.f61611c;
        }

        public String d() {
            return this.f61612d;
        }

        public String e() {
            return this.f61613e;
        }

        public String f() {
            return this.f61614f;
        }

        public String g() {
            return this.f61616h;
        }

        public String h() {
            return this.f61617i;
        }

        public String i() {
            return this.f61618j;
        }

        public String j() {
            return this.f61619k;
        }

        public String k() {
            return this.f61620l;
        }

        public void a(String str) {
            this.f61612d = str;
        }

        public String l() {
            return this.f61621m;
        }

        public String toString() {
            return "BaseUrl=" + this.f61614f + ", keyPrefix = " + this.f61612d;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static class c implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        BrandSafetyUtils.AdType f61626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f61627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f61628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f61629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        b f61630e;

        c(BrandSafetyUtils.AdType adType, String str, String str2, b bVar, a aVar) {
            this.f61626a = adType;
            this.f61627b = str;
            this.f61628c = str2;
            this.f61630e = bVar;
            this.f61629d = aVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object compareTo) {
            return this.f61626a.ordinal() - ((c) compareTo).f61626a.ordinal();
        }
    }

    public static String a(String str) {
        if (str == null || !str.contains("_")) {
            return null;
        }
        return str.substring(str.lastIndexOf("_") + 1);
    }

    private void d() {
        FileUploadData fileUploadDataB;
        File[] fileArrListFiles = new File(f61578p).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            Logger.d(f61579q, "loading saved file: ", file.getAbsolutePath());
            if (file.isFile() && file.getName().endsWith(f61577o) && (fileUploadDataB = b(file.getAbsolutePath())) != null) {
                a(fileUploadDataB, false);
            }
        }
    }

    public FileUploadData b(String str) {
        FileUploadData fileUploadData;
        FileInputStream fileInputStream;
        byte[] bArrB;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (TextUtils.isEmpty(str) || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bArrB = com.safedk.android.utils.n.b((InputStream) fileInputStream);
                fileUploadData = (FileUploadData) com.safedk.android.utils.i.a(new String(bArrB));
            } catch (Throwable th) {
                th = th;
                fileUploadData = null;
            }
        } catch (Throwable th2) {
            th = th2;
            fileUploadData = null;
        }
        try {
            Logger.d(f61579q, "File retrieved with ID: ", fileUploadData.a(), " amount of bytes: ", Integer.valueOf(bArrB.length));
            com.safedk.android.utils.n.a((Closeable) fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            try {
                Logger.d(f61579q, "Exception retrieving file content", th);
                d(str);
            } finally {
                com.safedk.android.utils.n.a((Closeable) fileInputStream2);
            }
        }
        return fileUploadData;
    }

    private void b(FileUploadData fileUploadData) {
        if (fileUploadData == null || TextUtils.isEmpty(fileUploadData.d())) {
            return;
        }
        String strF = fileUploadData.f();
        Logger.d(f61579q, "file for save path is: ", strF);
        File file = new File(strF);
        if (file.exists()) {
            return;
        }
        Logger.d(f61579q, "file for save name is: ", file.getName());
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(com.safedk.android.utils.i.a(fileUploadData).getBytes());
                Logger.d(f61579q, "File saved with ID: ", fileUploadData.a());
                com.safedk.android.utils.n.a((Closeable) fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    Logger.d(f61579q, "Error saving file content ", th.getMessage(), th);
                } finally {
                    com.safedk.android.utils.n.a((Closeable) fileOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean d(String str) {
        Logger.d(f61579q, "Removing file from disk started for: ", str);
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    private void e() {
        Logger.d(f61579q, "Removing outdated files scan started");
        synchronized (f61561V) {
            for (FileUploadData fileUploadData : f61561V.values()) {
                if (fileUploadData.g()) {
                    c(fileUploadData.a());
                }
            }
        }
    }

    private void c(FileUploadData fileUploadData) {
        String strE = fileUploadData.e();
        HashSet<FileUploadData> hashSet = f61562W.get(strE);
        if (hashSet != null) {
            hashSet.remove(fileUploadData);
            if (hashSet.size() == 0) {
                f61562W.remove(strE);
            }
        }
    }

    public void a(FileUploadData fileUploadData) {
        a(fileUploadData, true);
    }

    public void a(FileUploadData fileUploadData, boolean z2) {
        String strA = fileUploadData.a();
        String strE = fileUploadData.e();
        Logger.d(f61579q, "add file upload data - file id: ", strA, " for CI id: ", strE);
        if (f61561V.size() == f61561V.b()) {
            c(f61561V.a());
        }
        synchronized (f61561V) {
            f61561V.put(strA, fileUploadData);
        }
        if (!f61562W.containsKey(strE)) {
            f61562W.put(strE, new HashSet<>());
        }
        f61562W.get(strE).add(fileUploadData);
        if (z2) {
            b(fileUploadData);
        }
    }

    public void c(String str) {
        FileUploadData fileUploadDataRemove;
        Logger.d(f61579q, "Removing file upload data with id: ", str);
        synchronized (f61561V) {
            fileUploadDataRemove = f61561V.remove(str);
        }
        if (fileUploadDataRemove != null) {
            c(fileUploadDataRemove);
            d(fileUploadDataRemove.f());
        }
    }

    public HashSet<FileUploadData> a(CreativeInfo creativeInfo) {
        if (creativeInfo == null || creativeInfo.N() == null) {
            return null;
        }
        return f61562W.get(creativeInfo.N());
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class FileUploadData extends PersistableBase {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f61602g = "FileUploadData";
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f61603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f61604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f61605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f61606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f61607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f61608f;

        public FileUploadData() {
        }

        public FileUploadData(String type, String fileContent) {
            this(type, fileContent, null);
        }

        public FileUploadData(String type, String fileContent, String adId) {
            this.f61603a = UUID.randomUUID().toString();
            this.f61604b = type;
            this.f61605c = com.safedk.android.utils.k.o(fileContent);
            this.f61606d = fileContent;
            this.f61608f = System.currentTimeMillis();
            this.f61607e = adId;
            Logger.d(f61602g, "FileUploadData ctor, fileId=", this.f61603a, ", type=", type, ", hash=", this.f61605c, " ad id=", adId);
        }

        public String a() {
            return this.f61603a;
        }

        public String b() {
            return this.f61604b;
        }

        public String c() {
            return this.f61605c;
        }

        public String d() {
            return this.f61606d;
        }

        public String e() {
            return this.f61607e;
        }

        public String f() {
            return FileUploadManager.f61578p + this.f61604b + "_" + this.f61603a + FileUploadManager.f61577o;
        }

        public boolean g() {
            boolean z2 = System.currentTimeMillis() - this.f61608f > SignalManager.TWENTY_FOUR_HOURS_MILLIS;
            if (z2) {
                Logger.d(f61602g, "is outdated returned true for file with id: ", this.f61603a);
            }
            return z2;
        }

        public Bundle h() {
            Bundle bundle = new Bundle();
            bundle.putString("id", this.f61603a);
            bundle.putString("type", this.f61604b);
            bundle.putString(FileUploadManager.f61559T, this.f61605c);
            return bundle;
        }

        public int hashCode() {
            return this.f61603a.hashCode();
        }

        public String toString() {
            return "fileId=" + this.f61603a + ", type=" + this.f61604b + ", hash=" + this.f61605c + ", creation=" + this.f61608f;
        }

        @Override // com.safedk.android.utils.f
        public JSONObject i() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.f61603a)) {
                jSONObject.put("fileId", this.f61603a);
            }
            if (!TextUtils.isEmpty(this.f61604b)) {
                jSONObject.put("type", this.f61604b);
            }
            if (!TextUtils.isEmpty(this.f61605c)) {
                jSONObject.put("sha1Value", this.f61605c);
            }
            if (!TextUtils.isEmpty(this.f61606d)) {
                jSONObject.put("fileContent", this.f61606d);
            }
            if (!TextUtils.isEmpty(this.f61607e)) {
                jSONObject.put("adId", this.f61607e);
            }
            jSONObject.put("creationTime", this.f61608f);
            return jSONObject;
        }

        @Override // com.safedk.android.utils.f
        public void a(JSONObject jSONObject) throws JSONException {
            this.f61603a = jSONObject.optString("fileId", "");
            this.f61604b = jSONObject.optString("type", "");
            this.f61605c = jSONObject.optString("sha1Value", "");
            this.f61606d = jSONObject.optString("fileContent", "");
            this.f61607e = jSONObject.optString("adId", "");
            this.f61608f = jSONObject.optLong("creationTime", 0L);
        }
    }
}
