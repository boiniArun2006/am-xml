package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class s4 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Map f60780t = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f60781n;
    private final String rl;

    public synchronized Void O(CN3 cn3) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f60781n.openFileOutput(this.rl, 0);
        try {
            fileOutputStreamOpenFileOutput.write(cn3.toString().getBytes(com.google.android.exoplayer2.C.UTF8_NAME));
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
        return null;
    }

    public synchronized Void n() {
        this.f60781n.deleteFile(this.rl);
        return null;
    }

    public synchronized CN3 nr() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        try {
            fileInputStreamOpenFileInput = this.f60781n.openFileInput(this.rl);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th2) {
            fileInputStreamOpenFileInput = null;
            th = th2;
        }
        try {
            int iAvailable = fileInputStreamOpenFileInput.available();
            byte[] bArr = new byte[iAvailable];
            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
            CN3 cn3Rl = CN3.rl(new JSONObject(new String(bArr, com.google.android.exoplayer2.C.UTF8_NAME)));
            fileInputStreamOpenFileInput.close();
            return cn3Rl;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            throw th;
        }
    }

    public static synchronized s4 t(Context context, String str) {
        Map map;
        try {
            map = f60780t;
            if (!map.containsKey(str)) {
                map.put(str, new s4(context, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (s4) map.get(str);
    }

    String rl() {
        return this.rl;
    }

    private s4(Context context, String str) {
        this.f60781n = context;
        this.rl = str;
    }
}
