package com.fyber.inneractive.sdk.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.r;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class IFyberAdIdentifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClickListener f56950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f56956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f56958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f56959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Corner f56960k = Corner.BOTTOM_LEFT;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.a f56961l;

    public interface ClickListener {
        void a();
    }

    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public abstract void a(ViewGroup viewGroup);

    public IFyberAdIdentifier(r rVar) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        this.f56951b = 0;
        this.f56952c = 0;
        this.f56953d = 0;
        this.f56954e = 0;
        this.f56955f = 0;
        this.f56956g = null;
        this.f56957h = "";
        this.f56958i = "";
        this.f56959j = false;
        this.f56961l = com.fyber.inneractive.sdk.config.global.features.b.f53359e;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.b bVar = (com.fyber.inneractive.sdk.config.global.features.b) rVar.a(com.fyber.inneractive.sdk.config.global.features.b.class);
            Integer numA = bVar.a("ad_identifier_text_size_w");
            if (numA != null) {
                iIntValue = numA.intValue();
            } else {
                iIntValue = 110;
            }
            this.f56951b = iIntValue;
            Integer numA2 = bVar.a("ad_identifier_text_size_h");
            if (numA2 != null) {
                iIntValue2 = numA2.intValue();
            } else {
                iIntValue2 = 18;
            }
            this.f56952c = iIntValue2;
            Integer numA3 = bVar.a("ad_identifier_image_size_w");
            if (numA3 != null) {
                iIntValue3 = numA3.intValue();
            } else {
                iIntValue3 = 18;
            }
            this.f56953d = iIntValue3;
            Integer numA4 = bVar.a("ad_identifier_image_size_h");
            this.f56954e = numA4 != null ? numA4.intValue() : 18;
            Integer numA5 = bVar.a("ad_identifier_text_size");
            if (numA5 != null) {
                iIntValue4 = numA5.intValue();
            } else {
                iIntValue4 = 8;
            }
            this.f56955f = iIntValue4;
            this.f56956g = bVar.a("ad_identifier_tint_color", "#75DCDCDC");
            this.f56961l = bVar.c();
            this.f56957h = bVar.a("ad_identifier_text", "Tap for more information");
            this.f56958i = bVar.a("ad_identifier_icon_url", null);
            this.f56959j = true;
        }
    }
}
