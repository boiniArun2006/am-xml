package com.safedk.android.utils;

import android.content.Context;
import android.widget.Toast;
import com.safedk.android.SafeDK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f63214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f63215b;

    public m(String str) {
        this(str, null);
    }

    public m(String str, String str2) {
        this.f63214a = str;
        this.f63215b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        Context contextM = SafeDK.getInstance().m();
        StringBuilder sb = new StringBuilder();
        sb.append("SDK '");
        sb.append(this.f63214a);
        sb.append("' ");
        if (this.f63215b == null) {
            str = "";
        } else {
            str = "Toggle '" + this.f63215b + "'";
        }
        sb.append(str);
        sb.append(" blocked by SafeDK");
        Toast.makeText(contextM, sb.toString(), 0).show();
    }
}
