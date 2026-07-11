package com.safedk.android.a;

import com.google.android.exoplayer2.C;
import com.safedk.android.a.g;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    FileUploadManager.a f61235a;

    public a(String str, String str2, int i2, FileUploadManager.a aVar) {
        super(str, str2, i2);
        this.f61235a = aVar;
        this.f61259d = "AwsS3UploadFile";
        Logger.d(this.f61259d, "AwsS3UploadFile object created, File path=", str, ", hash=", str2, ", params =", aVar.toString());
    }

    @Override // com.safedk.android.a.g
    public g.a a() throws IOException {
        if (this.f61261j == null) {
            Logger.d(this.f61259d, "File to upload is null");
            return null;
        }
        String str = this.f61235a.f() + "/";
        Logger.d(this.f61259d, "About to upload File to ", str, ", prefix=", this.f61235a.d(), ",File path: ", this.f61261j);
        d dVar = new d("POST", str, C.UTF8_NAME, this.f61260i, new HashMap());
        File file = new File(this.f61261j);
        if (!file.exists()) {
            Logger.d(this.f61259d, "File file to upload not found ", this.f61261j);
            return null;
        }
        dVar.a("key", this.f61235a.d() + "/" + this.f61262k + ".jpg");
        dVar.a("AWSAccessKeyId", this.f61235a.a());
        dVar.a("acl", this.f61235a.g());
        dVar.a("Content-Type", this.f61235a.l());
        dVar.a("policy", this.f61235a.b());
        dVar.a("signature", this.f61235a.c());
        dVar.a("x-amz-server-side-encryption", this.f61235a.j());
        dVar.a("X-Amz-Credential", this.f61235a.k());
        dVar.a("X-Amz-Algorithm", this.f61235a.h());
        dVar.a("X-Amz-Date", this.f61235a.i());
        dVar.a(FileUploadManager.f61570h, file, true);
        dVar.a();
        String str2 = this.f61235a.f() + "/" + this.f61235a.d() + "/" + this.f61262k + ".jpg";
        Logger.d(this.f61259d, "File uploaded successfully to AWS");
        return new g.a(str2, dVar.b(), this.f61262k);
    }
}
