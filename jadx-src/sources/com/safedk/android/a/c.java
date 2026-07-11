package com.safedk.android.a;

import Hr.CQ.USEaHtCMH;
import android.graphics.Trmy.yioUaKMByL;
import android.os.Bundle;
import com.google.android.exoplayer2.C;
import com.safedk.android.a.g;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    FileUploadManager.b f61242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f61243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f61244c;

    public c(String str, int i2, FileUploadManager.b bVar, String str2) {
        super(null, str, i2);
        this.f61243b = null;
        this.f61244c = "GcsUploadFile";
        this.f61242a = bVar;
        this.f61243b = str2;
        Logger.d("GcsUploadFile", "GcsUploadFile object created for File upload, hash=", str, ", params =", bVar.toString());
    }

    public c(String str, String str2, int i2, FileUploadManager.b bVar) {
        super(str, str2, i2);
        this.f61243b = null;
        this.f61244c = "GcsUploadFile";
        this.f61242a = bVar;
        Logger.d("GcsUploadFile", "GcsUploadFile object created, File path=", str, ", hash=", str2, ", params =", bVar.toString());
    }

    @Override // com.safedk.android.a.g
    public g.a a() throws IOException {
        if (this.f61261j == null) {
            Logger.d(this.f61244c, "File to upload is null");
            return null;
        }
        File file = new File(this.f61261j);
        if (!file.exists()) {
            Logger.d(this.f61244c, USEaHtCMH.zLXAlY, this.f61261j);
            return null;
        }
        String strD = this.f61242a.d();
        Logger.d(this.f61244c, "About to upload File to ", strD, ", prefix=", this.f61242a.a(), ", File path: ", this.f61261j);
        Bundle bundleC = this.f61242a.c();
        Logger.printFullVerboseLog(this.f61244c, "Uploading File with headers: ", bundleC);
        HashMap map = new HashMap();
        for (String str : bundleC.keySet()) {
            Logger.d(this.f61244c, "adding field key: ", str, " with value: ", bundleC.getString(str));
            map.put(str, bundleC.getString(str));
        }
        d dVar = new d(g.f61256f, strD, C.UTF8_NAME, this.f61260i, map);
        dVar.a(FileUploadManager.f61570h, file, false);
        dVar.a();
        String str2 = this.f61242a.a() + this.f61242a.b();
        Logger.d(this.f61244c, yioUaKMByL.SOO);
        return new g.a(str2, dVar.b(), this.f61262k);
    }

    public g.a b() throws IOException {
        String strD = this.f61242a.d();
        Logger.d(this.f61244c, "About to upload File to ", strD, ", prefix=", this.f61242a.a());
        Bundle bundleC = this.f61242a.c();
        Logger.printFullVerboseLog(this.f61244c, "Uploading File with headers: ", bundleC);
        HashMap map = new HashMap();
        for (String str : bundleC.keySet()) {
            Logger.d(this.f61244c, "adding field key: ", str, " with value: ", bundleC.getString(str));
            map.put(str, bundleC.getString(str));
        }
        d dVar = new d(g.f61256f, strD, C.UTF8_NAME, this.f61260i, map);
        a(dVar);
        dVar.a();
        Logger.d(this.f61244c, "File uploaded successfully to GCS");
        return new g.a(strD, dVar.b(), this.f61262k);
    }

    public void a(d dVar) throws IOException {
        File fileCreateTempFile = null;
        try {
            try {
                fileCreateTempFile = File.createTempFile(FileUploadManager.f61570h, ".gz");
                Logger.d(this.f61244c, "created temp file in: ", fileCreateTempFile.getAbsolutePath());
                new FileOutputStream(fileCreateTempFile).write(this.f61243b.getBytes(C.UTF8_NAME));
                dVar.a(fileCreateTempFile);
            } catch (IOException e2) {
                Logger.d(this.f61244c, "Error adding gzip file: ", e2);
                if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                }
            }
            if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                fileCreateTempFile.delete();
            }
        } catch (Throwable th) {
            if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                fileCreateTempFile.delete();
            }
            throw th;
        }
    }
}
