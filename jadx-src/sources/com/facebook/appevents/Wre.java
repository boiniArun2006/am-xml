package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.Ml;
import com.facebook.appevents.j;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f52291n = new Wre();
    private static final String rl = Wre.class.getName();

    private static final class j extends ObjectInputStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0741j f52292n = new C0741j(null);

        /* JADX INFO: renamed from: com.facebook.appevents.Wre$j$j, reason: collision with other inner class name */
        public static final class C0741j {
            public /* synthetic */ C0741j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0741j() {
            }
        }

        public j(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                resultClassDescriptor = ObjectStreamClass.lookup(j.n.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                resultClassDescriptor = ObjectStreamClass.lookup(Ml.n.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:8:0x002b, B:9:0x002e, B:44:0x009a, B:14:0x003c, B:32:0x006f, B:33:0x0072, B:37:0x0084, B:36:0x007d, B:26:0x0059, B:27:0x005c, B:30:0x0067, B:31:0x006b, B:38:0x0085, B:39:0x0088, B:42:0x0093), top: B:57:0x0003, inners: #2, #3, #9, #10 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized K n() {
        K k2;
        ?? r42;
        Throwable th;
        j jVar;
        String str;
        String str2;
        Object obj;
        Object obj2;
        UiE.fuX.rl();
        ?? Qie = com.facebook.s4.qie();
        k2 = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = Qie.openFileInput("AppEventsLogger.persistedevents");
                Intrinsics.checkNotNullExpressionValue(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                jVar = new j(new BufferedInputStream(fileInputStreamOpenFileInput));
                try {
                    Object object = jVar.readObject();
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                    K k3 = (K) object;
                    com.facebook.internal.vd.mUb(jVar);
                    try {
                        File fileStreamPath = Qie.getFileStreamPath("AppEventsLogger.persistedevents");
                        fileStreamPath.delete();
                        obj2 = fileStreamPath;
                        obj = jVar;
                    } catch (Exception e2) {
                        Log.w(rl, "Got unexpected exception when removing events file: ", e2);
                        obj2 = e2;
                        obj = "Got unexpected exception when removing events file: ";
                    }
                    k2 = k3;
                    Qie = obj2;
                    r42 = obj;
                } catch (FileNotFoundException unused) {
                    com.facebook.internal.vd.mUb(jVar);
                    try {
                        Qie.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e3) {
                        e = e3;
                        str = rl;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                    if (k2 == null) {
                    }
                    return k2;
                } catch (Exception e4) {
                    e = e4;
                    Log.w(rl, "Got unexpected exception while reading events: ", e);
                    com.facebook.internal.vd.mUb(jVar);
                    try {
                        File fileStreamPath2 = Qie.getFileStreamPath("AppEventsLogger.persistedevents");
                        fileStreamPath2.delete();
                        Qie = fileStreamPath2;
                        r42 = jVar;
                    } catch (Exception e5) {
                        e = e5;
                        str = rl;
                        str2 = "Got unexpected exception when removing events file: ";
                        Log.w(str, str2, e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                com.facebook.internal.vd.mUb(r42);
                try {
                    Qie.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e6) {
                    Log.w(rl, "Got unexpected exception when removing events file: ", e6);
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            jVar = null;
        } catch (Exception e7) {
            e = e7;
            jVar = null;
        } catch (Throwable th3) {
            r42 = 0;
            th = th3;
            com.facebook.internal.vd.mUb(r42);
            Qie.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            throw th;
        }
        if (k2 == null) {
            k2 = new K();
        }
        return k2;
    }

    public static final void rl(K k2) {
        ObjectOutputStream objectOutputStream;
        Context contextQie = com.facebook.s4.qie();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextQie.openFileOutput("AppEventsLogger.persistedevents", 0)));
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(k2);
            com.facebook.internal.vd.mUb(objectOutputStream);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            try {
                Log.w(rl, "Got unexpected exception while persisting events: ", th);
                try {
                    contextQie.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
            } finally {
                com.facebook.internal.vd.mUb(objectOutputStream2);
            }
        }
    }

    private Wre() {
    }
}
