package b1P;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import WzY.SPz;
import WzY.s4;
import WzY.yg;
import XoT.C;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.snap.SnapGuide;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yc.RP;
import yc.nKE;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class I28 {
    private static final Vector2D Uo(Vector2D vector2D) {
        return vector2D;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[w6.values().length];
            try {
                iArr[w6.f43148n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.f43149t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Wre.values().length];
            try {
                iArr2[Wre.f43137n.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Wre.f43139t.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Wre.f43136O.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[b1P.j.values().length];
            try {
                iArr3[b1P.j.f43141n.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[b1P.j.f43144t.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[b1P.j.f43140O.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[b1P.j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private static final void J2(SnapGuide snapGuide, s4 s4Var, yg ygVar, final Transform transform, float f3, float f4, float f5, float f6) {
        C.Uo(snapGuide, new Function0() { // from class: b1P.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.KN(transform);
            }
        });
        Vector2D vector2DUo = Uo(new Vector2D(f3, f4));
        Vector2D vector2DUo2 = Uo(new Vector2D(f5, f6));
        s4Var.fD(vector2DUo.getX(), vector2DUo.getY(), vector2DUo2.getX(), vector2DUo2.getY(), ygVar);
    }

    public static final void O(SnapGuide snapGuide, s4 ucanvas, yg snapPaint, nKE userPreviewMode, Transform cameraTransform) {
        Intrinsics.checkNotNullParameter(snapGuide, "<this>");
        Intrinsics.checkNotNullParameter(ucanvas, "ucanvas");
        Intrinsics.checkNotNullParameter(snapPaint, "snapPaint");
        Intrinsics.checkNotNullParameter(userPreviewMode, "userPreviewMode");
        Intrinsics.checkNotNullParameter(cameraTransform, "cameraTransform");
        float fTy = SPz.ty(ucanvas, 2131166357) / RP.KN(userPreviewMode);
        int i2 = j.$EnumSwitchMapping$1[snapGuide.getType().ordinal()];
        if (i2 == 1 || i2 == 2) {
            snapPaint.az(fTy);
            snapPaint.gh(SolidColor.INSTANCE.getRED());
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            snapPaint.az(fTy * 2.0f);
            snapPaint.gh(SolidColor.INSTANCE.getRED());
        }
        if (snapGuide.getLength() == -1.0f) {
            int i3 = j.$EnumSwitchMapping$0[snapGuide.getAxis().ordinal()];
            if (i3 == 1) {
                J2(snapGuide, ucanvas, snapPaint, cameraTransform, snapGuide.getPos().getX(), -999999.0f, snapGuide.getPos().getX(), 999999.0f);
                return;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                J2(snapGuide, ucanvas, snapPaint, cameraTransform, -999999.0f, snapGuide.getPos().getY(), 999999.0f, snapGuide.getPos().getY());
                return;
            }
        }
        int i5 = j.$EnumSwitchMapping$0[snapGuide.getAxis().ordinal()];
        if (i5 == 1) {
            J2(snapGuide, ucanvas, snapPaint, cameraTransform, snapGuide.getPos().getX() - 8.0f, snapGuide.getPos().getY(), snapGuide.getPos().getX() - 8.0f, snapGuide.getPos().getY() + snapGuide.getLength());
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            J2(snapGuide, ucanvas, snapPaint, cameraTransform, snapGuide.getPos().getX(), snapGuide.getPos().getY() + 8.0f, snapGuide.getPos().getX() + snapGuide.getLength(), snapGuide.getPos().getY() + 8.0f);
        }
    }

    public static /* synthetic */ n nr(w6 w6Var, float f3, float f4, Wre wre, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            wre = Wre.f43137n;
        }
        return t(w6Var, f3, f4, wre);
    }

    public static final n rl(Rectangle bounds, b1P.j jVar) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(jVar, pTYaLzzmJSGAPQ.DJhAxlry);
        int i2 = j.$EnumSwitchMapping$2[jVar.ordinal()];
        if (i2 == 1) {
            w6 w6Var = w6.f43148n;
            float y2 = bounds.getSize().getY();
            return new n(w6Var, y2, CollectionsKt.listOf(new SnapGuide(w6Var, new Vector2D(bounds.getLeft(), bounds.getTop()), Wre.f43139t, y2)));
        }
        if (i2 == 2) {
            w6 w6Var2 = w6.f43149t;
            float x2 = bounds.getSize().getX();
            return new n(w6Var2, x2, CollectionsKt.listOf(new SnapGuide(w6Var2, new Vector2D(bounds.getLeft(), bounds.getTop()), Wre.f43139t, x2)));
        }
        if (i2 == 3) {
            w6 w6Var3 = w6.f43148n;
            float y3 = bounds.getSize().getY();
            return new n(w6Var3, y3, CollectionsKt.listOf(new SnapGuide(w6Var3, new Vector2D(bounds.getRight(), bounds.getTop()), Wre.f43139t, y3)));
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        w6 w6Var4 = w6.f43149t;
        float x3 = bounds.getSize().getX();
        return new n(w6Var4, x3, CollectionsKt.listOf(new SnapGuide(w6Var4, new Vector2D(bounds.getLeft(), bounds.getBottom()), Wre.f43139t, x3)));
    }

    public static final n t(w6 axis, float f3, float f4, Wre type) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(type, "type");
        int i2 = j.$EnumSwitchMapping$0[axis.ordinal()];
        if (i2 == 1) {
            return new n(axis, f3, CollectionsKt.listOf(new SnapGuide(axis, new Vector2D(f4, 0.0f), type, -1.0f)));
        }
        if (i2 == 2) {
            return new n(axis, f3, CollectionsKt.listOf(new SnapGuide(axis, new Vector2D(0.0f, f4), type, -1.0f)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(Transform transform) {
        return "cameraTransform: " + transform.getLocation() + " " + transform.getScale() + " " + transform.getRotation();
    }
}
