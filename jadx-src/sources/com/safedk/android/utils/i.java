package com.safedk.android.utils;

import android.util.Base64;
import com.safedk.android.analytics.reporters.CrashReporter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63187a = "SerializingUtils";

    public static String a(Object obj) {
        Closeable closeable;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        String strEncodeToString = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            synchronized (obj) {
                                objectOutputStream.writeObject(obj);
                            }
                            objectOutputStream.flush();
                            strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            n.a((Closeable) objectOutputStream);
                        } catch (IOException e2) {
                            e = e2;
                            Logger.d(f63187a, "failed during serialization object: ", obj, " : ", e.getMessage(), e);
                            n.a((Closeable) objectOutputStream);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        objectOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        closeable = null;
                        n.a(closeable);
                        n.a((Closeable) byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger.d(f63187a, "failed during serializing object : ", th2.getMessage(), " for object : ", obj, th2);
                    new CrashReporter().caughtException(th2);
                    return null;
                }
            } catch (IOException e4) {
                e = e4;
                byteArrayOutputStream = null;
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                closeable = null;
            }
            n.a((Closeable) byteArrayOutputStream);
            return strEncodeToString;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static Object a(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (Throwable th2) {
                th = th2;
                objectInputStream = null;
            }
        } catch (Throwable th3) {
            byteArrayInputStream = null;
            th = th3;
            objectInputStream = null;
        }
        try {
            Object object = objectInputStream.readObject();
            n.a((Closeable) objectInputStream);
            n.a((Closeable) byteArrayInputStream);
            return object;
        } catch (Throwable th4) {
            th = th4;
            n.a((Closeable) objectInputStream);
            n.a((Closeable) byteArrayInputStream);
            throw th;
        }
    }
}
