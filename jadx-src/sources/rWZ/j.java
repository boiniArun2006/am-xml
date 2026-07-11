package rWZ;

import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeKt;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import f.EnumC1982eO;
import gIX.DAz;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tu.Ew;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class j {

    /* JADX INFO: renamed from: rWZ.j$j, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public /* synthetic */ class C1159j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[CN3.values().length];
            try {
                iArr[CN3.f73053n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CN3.f73054t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Dsr.values().length];
            try {
                iArr2[Dsr.f73056n.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Dsr.f73058t.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Dsr.f73055O.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SceneElementType.values().length];
            try {
                iArr3[SceneElementType.Drawing.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[SceneElementType.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[SceneElementType.Audio.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[SceneElementType.Camera.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[SceneElementType.NullObject.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[SceneElementType.Scene.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[SceneElementType.Shape.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SceneType.values().length];
            try {
                iArr4[SceneType.SCENE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[SceneType.ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[SceneType.PRESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Ew.values().length];
            try {
                iArr5[Ew.f73883o.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[Ew.f73880Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[Ew.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[Ew.f73884r.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[DAz.values().length];
            try {
                iArr6[DAz.f67201n.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[DAz.f67202t.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[six.CN3.values().length];
            try {
                iArr7[six.CN3.f73284t.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[six.CN3.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[six.CN3.f73283r.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[six.CN3.f73279O.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[Q.j.values().length];
            try {
                iArr8[Q.j.f7881n.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[Q.j.f7882t.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[mg4.w6.values().length];
            try {
                iArr9[mg4.w6.f70997n.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr9[mg4.w6.f70998t.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[EnumC1982eO.values().length];
            try {
                iArr10[EnumC1982eO.f64022n.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr10[EnumC1982eO.f64025t.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr10[EnumC1982eO.f64016O.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr10[EnumC1982eO.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr10[EnumC1982eO.f64024r.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr10[EnumC1982eO.f64023o.ordinal()] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr10[EnumC1982eO.f64019Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr10[EnumC1982eO.f64017S.ordinal()] = 8;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr10[EnumC1982eO.f64021g.ordinal()] = 9;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr10[EnumC1982eO.E2.ordinal()] = 10;
            } catch (NoSuchFieldError unused39) {
            }
            $EnumSwitchMapping$9 = iArr10;
        }
    }

    public static final String J2(EnumC1982eO enumC1982eO) {
        Intrinsics.checkNotNullParameter(enumC1982eO, "<this>");
        switch (C1159j.$EnumSwitchMapping$9[enumC1982eO.ordinal()]) {
            case 1:
                return "inverted_checkbox";
            case 2:
                return YmsTEL.yecuLhpbwnOlMex;
            case 3:
                return "checkbox_options";
            case 4:
                return "cloud_cards_tiers";
            case 5:
                return "cloud_cards_tiers_no_trial";
            case 6:
                return "cloud_upsell";
            case 7:
                return "cloud_cards_tiers_cloud_discounted";
            case 8:
                return "cloud_countdown_24hrs_paywall";
            case 9:
                return "cloud_one_chance";
            case 10:
                return "playful_unlock_ft";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String KN(mg4.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        int i2 = C1159j.$EnumSwitchMapping$8[w6Var.ordinal()];
        if (i2 == 1) {
            return l.aa;
        }
        if (i2 == 2) {
            return "high";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String O(SceneType sceneType) {
        Intrinsics.checkNotNullParameter(sceneType, "<this>");
        int i2 = C1159j.$EnumSwitchMapping$3[sceneType.ordinal()];
        if (i2 == 1) {
            return "project";
        }
        if (i2 == 2) {
            return "element";
        }
        if (i2 == 3) {
            return "preset";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String Uo(DAz dAz) {
        Intrinsics.checkNotNullParameter(dAz, "<this>");
        int i2 = C1159j.$EnumSwitchMapping$5[dAz.ordinal()];
        if (i2 == 1) {
            return "link";
        }
        if (i2 == 2) {
            return "qr_code";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final pq.Ml gh(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        pq.Ml ml = new pq.Ml();
        String name = exc.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        ml.O("exception_type", name);
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown";
        }
        ml.O("exception_message", message);
        return ml;
    }

    public static final pq.w6 mUb(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        pq.w6 w6Var = new pq.w6();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w6Var.t((String) it.next());
        }
        return w6Var;
    }

    public static final String nr(SceneElementType sceneElementType) {
        Intrinsics.checkNotNullParameter(sceneElementType, "<this>");
        switch (C1159j.$EnumSwitchMapping$2[sceneElementType.ordinal()]) {
            case 1:
                return "drawing";
            case 2:
                return "text";
            case 3:
                return "audio";
            case 4:
                return "camera";
            case 5:
                return "null_object";
            case 6:
                return "group";
            case 7:
                return "shape";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String qie(six.CN3 cn3) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        int i2 = C1159j.$EnumSwitchMapping$6[cn3.ordinal()];
        if (i2 == 1) {
            return "projects";
        }
        if (i2 == 2) {
            return "elements";
        }
        if (i2 == 3) {
            return "cloud";
        }
        if (i2 == 4) {
            return "templates";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final C rl(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        switch (C1159j.$EnumSwitchMapping$2[sceneElement.getType().ordinal()]) {
            case 1:
                return C.f73047g;
            case 2:
                return C.f73046e;
            case 3:
                return C.J2;
            case 4:
                return C.f73050r;
            case 5:
                return C.f73049o;
            case 6:
                return sceneElement.getLinkedSceneUUID() != null ? C.f73042S : sceneElement.getTemplatePPId() == null ? C.f73045Z : C.f73044X;
            case 7:
                return sceneElement.getFillVideo() != null ? C.f73041O : sceneElement.getFillImage() != null ? C.f73051t : LiveShapeKt.getShape(sceneElement.getLiveShape()) != null ? C.f73048n : C.E2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String t(boolean z2) {
        return xMQ(z2 ? CN3.f73053n : CN3.f73054t);
    }

    public static final String xMQ(CN3 cn3) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        int i2 = C1159j.$EnumSwitchMapping$0[cn3.ordinal()];
        if (i2 == 1) {
            return "granted";
        }
        if (i2 == 2) {
            return "denied";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String n(int i2) {
        switch (i2) {
            case 2131361914:
                return "png";
            case 2131361915:
                return "gif";
            case 2131361916:
                return "image_sequence";
            case 2131361919:
                return "video";
            case 2131361920:
                return "xml";
            case 2131361969:
                return "preset";
            case 2131361970:
                return "project_package";
            case 2131361971:
                return c.f62175h;
            default:
                return null;
        }
    }
}
