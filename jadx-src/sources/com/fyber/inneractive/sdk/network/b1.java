package com.fyber.inneractive.sdk.network;

import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f54229p;

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i2) throws Throwable {
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        String string;
        o0 o0Var = new o0();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                InputStream inputStream = lVar.f54272c;
                File file = new File(Environment.getExternalStorageDirectory(), "Pictures");
                file.mkdirs();
                String strA = a(URI.create(this.f54229p), map);
                if (TextUtils.isEmpty(strA)) {
                    string = null;
                } else {
                    File file2 = new File(file, strA);
                    string = file2.toString();
                    fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(file2);
                    try {
                        com.fyber.inneractive.sdk.util.v.a(inputStream, fileOutputStreamFileOutputStreamCtor);
                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                    } catch (Exception unused) {
                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                        IAlog.a("failed to download and save the image file.", new Object[0]);
                    } catch (Throwable th) {
                        th = th;
                        com.fyber.inneractive.sdk.util.v.b(fileOutputStreamFileOutputStreamCtor);
                        throw th;
                    }
                }
                o0Var.f54294a = string;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStreamFileOutputStreamCtor = null;
            }
        } catch (Exception unused2) {
        }
        com.fyber.inneractive.sdk.util.v.b(fileOutputStream);
        return o0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    public b1(com.fyber.inneractive.sdk.web.x xVar, String str, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(xVar, g0.f54259c.a(), rVar);
        this.f54229p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f54229p;
    }

    public static String a(URI uri, Map map) {
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        String name = new File(path).getName();
        List list = map != null ? (List) map.get("Content-Type") : null;
        int i2 = 0;
        String str = list != null ? (String) list.get(0) : null;
        if (str != null) {
            String[] strArrSplit = str.split(";");
            int length = strArrSplit.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str2 = strArrSplit[i2];
                if (str2.contains("image/")) {
                    String str3 = "." + str2.split("/")[1];
                    if (!name.endsWith(str3)) {
                        return name + str3;
                    }
                } else {
                    i2++;
                }
            }
        }
        return name;
    }
}
