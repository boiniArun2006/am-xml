package com.fyber.inneractive.sdk.util;

import d8q.jqQ.QTafcm;
import java.util.Locale;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NATIVE_AD_IMAGE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class g {
    public static final /* synthetic */ g[] $VALUES;
    public static final g DEFAULT_ENDCARD;
    public static final g DISPLAY;
    public static final g FMP_ENDCARD;
    public static final g NATIVE;
    public static final g NATIVE_AD_DESCRIPTION;
    public static final g NATIVE_AD_ICON;
    public static final g NATIVE_AD_IMAGE;
    public static final g NATIVE_AD_RATING;
    public static final g NATIVE_AD_ROOT;
    public static final g NATIVE_AD_TITLE;
    public static final g NATIVE_AD_VIDEO;
    public static final g NATIVE_CTA;
    public static final g STORE_PROMO_CTA;
    public static final g VAST_ENDCARD;
    public static final g VIDEO_APP_INFO;
    public static final g VIDEO_CLICK;
    public static final g VIDEO_CTA;
    public final String key;
    public String mVersion = "";
    public int mOrderShown = 0;

    public final void a(String str) {
        this.mVersion = str;
    }

    static {
        g gVar = new g("DISPLAY", 0, "DISPLAY");
        DISPLAY = gVar;
        g gVar2 = new g("VIDEO_CTA", 1, "VIDEO_CTA");
        VIDEO_CTA = gVar2;
        g gVar3 = new g("VIDEO_CLICK", 2, "VIDEO_CLICK");
        VIDEO_CLICK = gVar3;
        g gVar4 = new g("VAST_ENDCARD", 3, "VAST_ENDCARD");
        VAST_ENDCARD = gVar4;
        g gVar5 = new g("DEFAULT_ENDCARD", 4, "DEFAULT_ENDCARD");
        DEFAULT_ENDCARD = gVar5;
        g gVar6 = new g("VIDEO_APP_INFO", 5, "VIDEO_APP_INFO");
        VIDEO_APP_INFO = gVar6;
        g gVar7 = new g("FMP_ENDCARD", 6, "FMP_ENDCARD");
        FMP_ENDCARD = gVar7;
        g gVar8 = new g("STORE_PROMO_CTA", 7, "STORE_PROMO_CTA");
        STORE_PROMO_CTA = gVar8;
        g gVar9 = new g("NATIVE_CTA", 8, "NATIVE_CTA");
        NATIVE_CTA = gVar9;
        g gVar10 = new g("NATIVE_AD_TITLE", 9, "NATIVE_AD_TITLE");
        NATIVE_AD_TITLE = gVar10;
        g gVar11 = new g("NATIVE_AD_DESCRIPTION", 10, "NATIVE_AD_DESCRIPTION");
        NATIVE_AD_DESCRIPTION = gVar11;
        g gVar12 = new g("NATIVE_AD_RATING", 11, "NATIVE_AD_RATING");
        NATIVE_AD_RATING = gVar12;
        String str = QTafcm.AVQRJNJFr;
        g gVar13 = new g(str, 12, str);
        NATIVE_AD_IMAGE = gVar13;
        g gVar14 = new g("NATIVE_AD_VIDEO", 13, "NATIVE_AD_VIDEO");
        NATIVE_AD_VIDEO = gVar14;
        g gVar15 = new g("NATIVE_AD_ICON", 14, "NATIVE_AD_ICON");
        NATIVE_AD_ICON = gVar15;
        g gVar16 = new g("NATIVE_AD_ROOT", 15, "NATIVE_AD_ROOT");
        NATIVE_AD_ROOT = gVar16;
        g gVar17 = new g("NATIVE", 16, "NATIVE");
        NATIVE = gVar17;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar17};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final String a() {
        return this.mVersion;
    }

    @Override // java.lang.Enum
    public final String toString() {
        if ((this != FMP_ENDCARD || this.mOrderShown != 1) && this.mOrderShown != 2) {
            return this.key;
        }
        Locale locale = Locale.US;
        return this.key + "_" + this.mOrderShown;
    }

    public g(String str, int i2, String str2) {
        this.key = str2;
    }

    public final void a(int i2) {
        this.mOrderShown = i2;
    }
}
