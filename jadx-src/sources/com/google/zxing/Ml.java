package com.google.zxing;

import NDY.C;
import NDY.Wre;
import NDY.Xo;
import NDY.aC;
import NDY.fuX;
import NDY.l3D;
import NDY.o;
import ak.C1510j;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml implements I28 {

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f61035n;

        static {
            int[] iArr = new int[com.google.zxing.j.values().length];
            f61035n = iArr;
            try {
                iArr[com.google.zxing.j.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61035n[com.google.zxing.j.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61035n[com.google.zxing.j.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f61035n[com.google.zxing.j.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f61035n[com.google.zxing.j.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f61035n[com.google.zxing.j.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f61035n[com.google.zxing.j.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f61035n[com.google.zxing.j.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f61035n[com.google.zxing.j.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f61035n[com.google.zxing.j.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f61035n[com.google.zxing.j.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f61035n[com.google.zxing.j.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f61035n[com.google.zxing.j.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.I28
    public x4x.n n(String str, com.google.zxing.j jVar, int i2, int i3, Map map) {
        I28 c2;
        switch (j.f61035n[jVar.ordinal()]) {
            case 1:
                c2 = new C();
                break;
            case 2:
                c2 = new l3D();
                break;
            case 3:
                c2 = new aC();
                break;
            case 4:
                c2 = new Xo();
                break;
            case 5:
                c2 = new ZP.j();
                break;
            case 6:
                c2 = new Wre();
                break;
            case 7:
                c2 = new fuX();
                break;
            case 8:
                c2 = new NDY.Ml();
                break;
            case 9:
                c2 = new o();
                break;
            case 10:
                c2 = new XO.j();
                break;
            case 11:
                c2 = new NDY.n();
                break;
            case 12:
                c2 = new Ee.j();
                break;
            case 13:
                c2 = new C1510j();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(jVar)));
        }
        return c2.n(str, jVar, i2, i3, map);
    }
}
