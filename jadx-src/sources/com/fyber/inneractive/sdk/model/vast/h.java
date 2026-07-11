package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f54143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f54144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f54146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f54147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f54148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f54149g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.vast.b f54151i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f54150h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f54152j = new ArrayList();

    public final boolean a() {
        return (TextUtils.isEmpty(this.f54148f) && TextUtils.isEmpty(this.f54147e) && this.f54146d == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.f54143a);
        sb.append(" h:");
        sb.append(this.f54144b);
        sb.append(" ctr:");
        sb.append(this.f54149g);
        sb.append(" clt:");
        sb.append(this.f54150h);
        if (!TextUtils.isEmpty(this.f54148f)) {
            sb.append(" html:");
            sb.append(this.f54148f);
        }
        if (this.f54146d != null) {
            sb.append(" static:");
            sb.append(this.f54146d.f54155b);
            sb.append("creative:");
            sb.append(this.f54146d.f54154a);
        }
        if (!TextUtils.isEmpty(this.f54147e)) {
            sb.append(" iframe:");
            sb.append(this.f54147e);
        }
        sb.append(" events:");
        sb.append(this.f54152j);
        if (this.f54151i != null) {
            sb.append(" reason:");
            sb.append(this.f54151i.f53938a);
            sb.append(" exception:");
            sb.append(this.f54151i.getMessage());
        }
        return sb.toString();
    }
}
