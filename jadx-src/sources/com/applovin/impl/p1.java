package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.r2;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class p1 extends r2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q1 f49649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f49650o;

    @Override // com.applovin.impl.r2
    public boolean o() {
        return true;
    }

    public p1(q1 q1Var, Context context) {
        super(r2.c.DETAIL);
        this.f49649n = q1Var;
        this.f49650o = context;
        this.f49833c = r();
        this.f49834d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + n7.a(this.f49649n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f49649n.d());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f49649n.f());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.r2
    public int e() {
        return m0.a(R.color.applovin_sdk_disclosureButtonColor, this.f49650o);
    }

    @Override // com.applovin.impl.r2
    public int d() {
        if (o()) {
            return R.drawable.applovin_ic_disclosure_arrow;
        }
        return super.h();
    }
}
