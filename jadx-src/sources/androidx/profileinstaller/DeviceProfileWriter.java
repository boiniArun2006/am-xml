package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.ProfileInstaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class DeviceProfileWriter {
    private final String J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final File f40921O;
    private final String Uo;
    private byte[] gh;
    private DexProfileData[] mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AssetManager f40922n;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ProfileInstaller.DiagnosticsCallback f40923t;
    private boolean xMQ = false;
    private final byte[] nr = nr();

    private DeviceProfileWriter rl(DexProfileData[] dexProfileDataArr, byte[] bArr) {
        InputStream inputStreamUo;
        try {
            inputStreamUo = Uo(this.f40922n, this.KN);
        } catch (FileNotFoundException e2) {
            this.f40923t.n(9, e2);
        } catch (IOException e3) {
            this.f40923t.n(7, e3);
        } catch (IllegalStateException e4) {
            this.mUb = null;
            this.f40923t.n(8, e4);
        }
        if (inputStreamUo == null) {
            if (inputStreamUo != null) {
                inputStreamUo.close();
            }
            return null;
        }
        try {
            this.mUb = ProfileTranscoder.r(inputStreamUo, ProfileTranscoder.ck(inputStreamUo, ProfileTranscoder.rl), bArr, dexProfileDataArr);
            inputStreamUo.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamUo.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private DexProfileData[] xMQ(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        DexProfileData[] dexProfileDataArrAYN = ProfileTranscoder.aYN(inputStream, ProfileTranscoder.ck(inputStream, ProfileTranscoder.f40937n), this.J2);
                        try {
                            inputStream.close();
                            return dexProfileDataArrAYN;
                        } catch (IOException e2) {
                            this.f40923t.n(7, e2);
                            return dexProfileDataArrAYN;
                        }
                    } catch (IOException e3) {
                        this.f40923t.n(7, e3);
                        return null;
                    }
                } catch (IllegalStateException e4) {
                    this.f40923t.n(8, e4);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e5) {
                this.f40923t.n(7, e5);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e6) {
                this.f40923t.n(7, e6);
            }
            throw th;
        }
    }

    private InputStream J2(AssetManager assetManager) {
        try {
            return Uo(assetManager, this.Uo);
        } catch (FileNotFoundException e2) {
            this.f40923t.n(6, e2);
            return null;
        } catch (IOException e3) {
            this.f40923t.n(7, e3);
            return null;
        }
    }

    private void gh(final int i2, final Object obj) {
        this.rl.execute(new Runnable() { // from class: androidx.profileinstaller.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f40950n.f40923t.n(i2, obj);
            }
        });
    }

    private static boolean mUb() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 31 || i2 == 24 || i2 == 25;
    }

    private static byte[] nr() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return ProfileVersion.f40945n;
        }
        switch (i2) {
            case 24:
            case 25:
                return ProfileVersion.f40944O;
            case 26:
                return ProfileVersion.nr;
            case 27:
                return ProfileVersion.f40946t;
            case 28:
            case 29:
            case 30:
                return ProfileVersion.rl;
            default:
                return null;
        }
    }

    private void t() {
        if (!this.xMQ) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean O() {
        if (this.nr == null) {
            gh(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f40921O.exists()) {
            try {
                if (!this.f40921O.createNewFile()) {
                    gh(4, null);
                    return false;
                }
            } catch (IOException unused) {
                gh(4, null);
                return false;
            }
        } else if (!this.f40921O.canWrite()) {
            gh(4, null);
            return false;
        }
        this.xMQ = true;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean az() {
        byte[] bArr = this.gh;
        if (bArr == null) {
            return false;
        }
        t();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f40921O);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                Encoding.qie(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                gh(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                gh(6, e2);
                return false;
            } catch (IOException e3) {
                gh(7, e3);
                return false;
            }
        } finally {
            this.gh = null;
            this.mUb = null;
        }
    }

    public DeviceProfileWriter qie() {
        ByteArrayOutputStream byteArrayOutputStream;
        DexProfileData[] dexProfileDataArr = this.mUb;
        byte[] bArr = this.nr;
        if (dexProfileDataArr != null && bArr != null) {
            t();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ProfileTranscoder.e(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                this.f40923t.n(7, e2);
            } catch (IllegalStateException e3) {
                this.f40923t.n(8, e3);
            }
            if (!ProfileTranscoder.iF(byteArrayOutputStream, bArr, dexProfileDataArr)) {
                this.f40923t.n(5, null);
                this.mUb = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.gh = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.mUb = null;
        }
        return this;
    }

    public DeviceProfileWriter(AssetManager assetManager, Executor executor, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String str, String str2, String str3, File file) {
        this.f40922n = assetManager;
        this.rl = executor;
        this.f40923t = diagnosticsCallback;
        this.J2 = str;
        this.Uo = str2;
        this.KN = str3;
        this.f40921O = file;
    }

    private InputStream Uo(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f40923t.rl(5, null);
            }
            return null;
        }
    }

    public DeviceProfileWriter KN() {
        DeviceProfileWriter deviceProfileWriterRl;
        t();
        if (this.nr != null) {
            InputStream inputStreamJ2 = J2(this.f40922n);
            if (inputStreamJ2 != null) {
                this.mUb = xMQ(inputStreamJ2);
            }
            DexProfileData[] dexProfileDataArr = this.mUb;
            if (dexProfileDataArr != null && mUb() && (deviceProfileWriterRl = rl(dexProfileDataArr, this.nr)) != null) {
                return deviceProfileWriterRl;
            }
        }
        return this;
    }
}
