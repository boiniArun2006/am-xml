package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedFile;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.exoplayer2.C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.a f54236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f54237c;

    public com.fyber.inneractive.sdk.cache.m a() throws Throwable {
        try {
            if (!this.f54236b.d()) {
                new c0();
                return new com.fyber.inneractive.sdk.cache.m();
            }
            Object objA = this.f54236b.a(a(this.f54236b.c()));
            if (this.f54237c == null) {
                this.f54237c = this.f54235a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new com.fyber.inneractive.sdk.cache.m(objA, this.f54237c.getString(this.f54236b.b(), null));
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }

    public final void b(String str) {
        if (this.f54237c == null) {
            this.f54237c = this.f54235a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f54237c.edit().putString(this.f54236b.b(), str).apply();
    }

    public d0(Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        this.f54235a = context;
        this.f54236b = aVar;
    }

    public final void b() {
        if (this.f54237c == null) {
            this.f54237c = this.f54235a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f54237c.edit().remove(this.f54236b.b()).apply();
    }

    public boolean a(String str, String str2) {
        boolean z2;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        boolean z3 = false;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.f54235a.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(str2.getBytes());
                z2 = true;
            } finally {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e2) {
                        IAlog.f("Failed closing cache file: %s", e2.getMessage());
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        try {
            IAlog.a("File cached successfully", new Object[0]);
            try {
                fileOutputStreamOpenFileOutput.close();
            } catch (Exception e4) {
                IAlog.f("Failed closing cache file: %s", e4.getMessage());
            }
        } catch (Exception e5) {
            e = e5;
            z3 = true;
            IAlog.f("Failed caching file: %s", e.getMessage());
            z2 = z3;
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) throws Throwable {
        FileInputStream fileInputStreamOpenFileInput;
        IAlog.a("reading local file: %s", str);
        EncryptedFile.EncryptedFileInputStream encryptedFileInputStream = 0;
        str = null;
        str = null;
        String str2 = null;
        try {
            try {
                fileInputStreamOpenFileInput = this.f54235a.openFileInput(str);
                try {
                    byte[] bArr = new byte[fileInputStreamOpenFileInput.available()];
                    fileInputStreamOpenFileInput.read(bArr);
                    String str3 = new String(bArr, C.UTF8_NAME);
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Exception e2) {
                        IAlog.f("Failed closing local file: %s", e2.getMessage());
                    }
                    str2 = str3;
                } catch (Exception e3) {
                    e = e3;
                    if (!(e instanceof FileNotFoundException)) {
                        IAlog.a("Failed reading local file: %s", e.getMessage());
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (Exception e4) {
                                IAlog.f("Failed closing local file: %s", e4.getMessage());
                            }
                        }
                    } else {
                        throw new FileNotFoundException();
                    }
                }
            } catch (Throwable th) {
                th = th;
                encryptedFileInputStream = "reading local file: %s";
                if (encryptedFileInputStream != 0) {
                    try {
                        encryptedFileInputStream.close();
                    } catch (Exception e5) {
                        IAlog.f("Failed closing local file: %s", e5.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th2) {
            th = th2;
            if (encryptedFileInputStream != 0) {
            }
            throw th;
        }
        IAlog.a("local file %s read successfully", str);
        return str2;
    }
}
