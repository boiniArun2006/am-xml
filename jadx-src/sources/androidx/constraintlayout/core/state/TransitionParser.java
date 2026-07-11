package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import com.caoccao.javet.interop.loader.JavetLibLoadingListener;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class TransitionParser {
    private static int n(String str, String... strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                return i2;
            }
        }
        return 0;
    }

    private static void rl(TypedBundle typedBundle, int i2, String str, String... strArr) {
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3].equals(str)) {
                typedBundle.rl(i2, i3);
            }
        }
    }

    public static void t(CLObject cLObject, Transition transition) throws CLParsingException {
        transition.s7N();
        String strN = cLObject.N("pathMotionArc");
        TypedBundle typedBundle = new TypedBundle();
        boolean z2 = true;
        boolean z3 = false;
        if (strN != null) {
            switch (strN) {
                case "startVertical":
                    typedBundle.rl(509, 1);
                    break;
                case "startHorizontal":
                    typedBundle.rl(509, 2);
                    break;
                case "flip":
                    typedBundle.rl(509, 3);
                    break;
                case "none":
                    typedBundle.rl(509, 0);
                    break;
                case "above":
                    typedBundle.rl(509, 5);
                    break;
                case "below":
                    typedBundle.rl(509, 4);
                    break;
            }
            z3 = true;
        }
        String strN2 = cLObject.N("interpolator");
        if (strN2 != null) {
            typedBundle.t(705, strN2);
            z3 = true;
        }
        float fNY = cLObject.nY("staggered");
        if (Float.isNaN(fNY)) {
            z2 = z3;
        } else {
            typedBundle.n(706, fNY);
        }
        if (z2) {
            transition.v(typedBundle);
        }
        CLObject cLObjectIF = cLObject.iF("onSwipe");
        if (cLObjectIF != null) {
            KN(cLObjectIF, transition);
        }
        J2(cLObject, transition);
    }

    public static void J2(CLObject cLObject, Transition transition) throws CLParsingException {
        CLObject cLObjectIF = cLObject.iF("KeyFrames");
        if (cLObjectIF == null) {
            return;
        }
        CLArray cLArrayAYN = cLObjectIF.aYN("KeyPositions");
        if (cLArrayAYN != null) {
            for (int i2 = 0; i2 < cLArrayAYN.size(); i2++) {
                CLElement cLElementXQ = cLArrayAYN.XQ(i2);
                if (cLElementXQ instanceof CLObject) {
                    Uo((CLObject) cLElementXQ, transition);
                }
            }
        }
        CLArray cLArrayAYN2 = cLObjectIF.aYN("KeyAttributes");
        if (cLArrayAYN2 != null) {
            for (int i3 = 0; i3 < cLArrayAYN2.size(); i3++) {
                CLElement cLElementXQ2 = cLArrayAYN2.XQ(i3);
                if (cLElementXQ2 instanceof CLObject) {
                    nr((CLObject) cLElementXQ2, transition);
                }
            }
        }
        CLArray cLArrayAYN3 = cLObjectIF.aYN("KeyCycles");
        if (cLArrayAYN3 != null) {
            for (int i5 = 0; i5 < cLArrayAYN3.size(); i5++) {
                CLElement cLElementXQ3 = cLArrayAYN3.XQ(i5);
                if (cLElementXQ3 instanceof CLObject) {
                    O((CLObject) cLElementXQ3, transition);
                }
            }
        }
    }

    private static void KN(CLContainer cLContainer, Transition transition) {
        String strN = cLContainer.N("anchor");
        int iN = n(cLContainer.N("side"), Transition.OnSwipe.XQ);
        int iN2 = n(cLContainer.N("direction"), Transition.OnSwipe.WPU);
        float fNY = cLContainer.nY("scale");
        float fNY2 = cLContainer.nY("threshold");
        float fNY3 = cLContainer.nY("maxVelocity");
        float fNY4 = cLContainer.nY("maxAccel");
        String strN2 = cLContainer.N("limitBounds");
        int iN3 = n(cLContainer.N("mode"), Transition.OnSwipe.aYN);
        int iN4 = n(cLContainer.N("touchUp"), Transition.OnSwipe.ViF);
        float fNY5 = cLContainer.nY("springMass");
        float fNY6 = cLContainer.nY("springStiffness");
        float fNY7 = cLContainer.nY("springDamping");
        float fNY8 = cLContainer.nY("stopThreshold");
        int iN5 = n(cLContainer.N("springBoundary"), Transition.OnSwipe.nY);
        String strN3 = cLContainer.N("around");
        Transition.OnSwipe onSwipeTy = transition.ty();
        onSwipeTy.KN(strN);
        onSwipeTy.xMQ(iN);
        onSwipeTy.gh(iN2);
        onSwipeTy.qie(fNY);
        onSwipeTy.az(fNY2);
        onSwipeTy.ck(fNY3);
        onSwipeTy.HI(fNY4);
        onSwipeTy.ty(strN2);
        onSwipeTy.mUb(iN3);
        onSwipeTy.Ik(iN4);
        onSwipeTy.XQ(fNY5);
        onSwipeTy.S(fNY6);
        onSwipeTy.Z(fNY7);
        onSwipeTy.WPU(fNY8);
        onSwipeTy.o(iN5);
        onSwipeTy.r(strN3);
    }

    private static void O(CLObject cLObject, Transition transition) throws CLParsingException {
        CLArray cLArrayWPU = cLObject.WPU("target");
        CLArray cLArrayWPU2 = cLObject.WPU("frames");
        String strN = cLObject.N("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", "period", "offset", "phase"};
        int[] iArr = {Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 306, 308, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 403, 423, 424, 425};
        int[] iArr2 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
        int size = cLArrayWPU2.size();
        TypedBundle[] typedBundleArr = new TypedBundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            typedBundleArr[i2] = new TypedBundle();
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < 12; i3++) {
            if (cLObject.nHg(strArr[i3]) && iArr2[i3] == 1) {
                z2 = true;
            }
        }
        int i5 = 0;
        for (int i7 = 12; i5 < i7; i7 = 12) {
            String str = strArr[i5];
            int i8 = iArr[i5];
            int i9 = iArr2[i5];
            CLArray cLArrayAYN = cLObject.aYN(str);
            String[] strArr2 = strArr;
            if (cLArrayAYN != null && cLArrayAYN.size() != size) {
                throw new CLParsingException("incorrect size for $attrName array, not matching targets array!", cLObject);
            }
            if (cLArrayAYN != null) {
                int i10 = 0;
                while (i10 < size) {
                    float fN = cLArrayAYN.getFloat(i10);
                    int i11 = i10;
                    if (i9 == 1) {
                        fN = transition.gh.n(fN);
                    } else if (i9 == 2 && z2) {
                        fN = transition.gh.n(fN);
                    }
                    typedBundleArr[i11].n(i8, fN);
                    i10 = i11 + 1;
                }
            } else {
                float fNY = cLObject.nY(str);
                if (Float.isNaN(fNY)) {
                    i5++;
                    strArr = strArr2;
                } else {
                    if (i9 == 1) {
                        fNY = transition.gh.n(fNY);
                    } else if (i9 == 2 && z2) {
                        fNY = transition.gh.n(fNY);
                    }
                    for (int i12 = 0; i12 < size; i12++) {
                        typedBundleArr[i12].n(i8, fNY);
                    }
                }
            }
            i5++;
            strArr = strArr2;
        }
        String strN2 = cLObject.N("curveFit");
        String strN3 = cLObject.N("easing");
        String strN4 = cLObject.N("waveShape");
        String strN5 = cLObject.N("customWave");
        for (int i13 = 0; i13 < cLArrayWPU.size(); i13++) {
            for (int i14 = 0; i14 < size; i14++) {
                String strE = cLArrayWPU.e(i13);
                TypedBundle typedBundle = typedBundleArr[i14];
                if (strN2 != null) {
                    if (strN2.equals("linear")) {
                        typedBundle.rl(401, 1);
                    } else if (strN2.equals("spline")) {
                        typedBundle.rl(401, 0);
                    }
                }
                typedBundle.O(501, strN);
                if (strN3 != null) {
                    typedBundle.t(420, strN3);
                }
                if (strN4 != null) {
                    typedBundle.t(421, strN4);
                }
                if (strN5 != null) {
                    typedBundle.t(422, strN5);
                }
                typedBundle.rl(100, cLArrayWPU2.getInt(i14));
                transition.xMQ(strE, typedBundle);
            }
        }
    }

    private static void Uo(CLObject cLObject, Transition transition) throws CLParsingException {
        TypedBundle typedBundle = new TypedBundle();
        CLArray cLArrayWPU = cLObject.WPU("target");
        CLArray cLArrayWPU2 = cLObject.WPU("frames");
        CLArray cLArrayAYN = cLObject.aYN("percentX");
        CLArray cLArrayAYN2 = cLObject.aYN("percentY");
        CLArray cLArrayAYN3 = cLObject.aYN("percentWidth");
        CLArray cLArrayAYN4 = cLObject.aYN("percentHeight");
        String strN = cLObject.N("pathMotionArc");
        String strN2 = cLObject.N("transitionEasing");
        String strN3 = cLObject.N("curveFit");
        String strN4 = cLObject.N("type");
        if (strN4 == null) {
            strN4 = "parentRelative";
        }
        if (cLArrayAYN == null || cLArrayWPU2.size() == cLArrayAYN.size()) {
            if (cLArrayAYN2 == null || cLArrayWPU2.size() == cLArrayAYN2.size()) {
                int i2 = 0;
                while (i2 < cLArrayWPU.size()) {
                    String strE = cLArrayWPU.e(i2);
                    int iN = n(strN4, "deltaRelative", "pathRelative", "parentRelative");
                    typedBundle.KN();
                    typedBundle.rl(510, iN);
                    if (strN3 != null) {
                        rl(typedBundle, 508, strN3, "spline", "linear");
                    }
                    typedBundle.O(501, strN2);
                    if (strN != null) {
                        rl(typedBundle, 509, strN, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                    }
                    int i3 = 0;
                    while (i3 < cLArrayWPU2.size()) {
                        typedBundle.rl(100, cLArrayWPU2.getInt(i3));
                        xMQ(typedBundle, 506, cLArrayAYN, i3);
                        xMQ(typedBundle, 507, cLArrayAYN2, i3);
                        xMQ(typedBundle, 503, cLArrayAYN3, i3);
                        xMQ(typedBundle, 504, cLArrayAYN4, i3);
                        transition.mUb(strE, typedBundle);
                        i3++;
                        strN4 = strN4;
                    }
                    i2++;
                    strN4 = strN4;
                }
            }
        }
    }

    private static void nr(CLObject cLObject, Transition transition) throws CLParsingException {
        CLArray cLArrayAYN;
        CustomVariable[][] customVariableArr;
        CLObject cLObject2;
        int i2;
        boolean z2 = true;
        CLArray cLArrayAYN2 = cLObject.aYN("target");
        if (cLArrayAYN2 == null || (cLArrayAYN = cLObject.aYN("frames")) == null) {
            return;
        }
        String strN = cLObject.N("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", aNrWBQYwFf.JTslJmgJNxeI, "rotationY", "rotationZ", "alpha"};
        int[] iArr = {Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 306, 308, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 303};
        boolean[] zArr = {false, false, true, true, true, false, false, false, false};
        int size = cLArrayAYN.size();
        TypedBundle[] typedBundleArr = new TypedBundle[size];
        for (int i3 = 0; i3 < cLArrayAYN.size(); i3++) {
            typedBundleArr[i3] = new TypedBundle();
        }
        int i5 = 0;
        for (int i7 = 9; i5 < i7; i7 = 9) {
            String str = strArr[i5];
            int i8 = iArr[i5];
            boolean z3 = zArr[i5];
            CLArray cLArrayAYN3 = cLObject.aYN(str);
            boolean z4 = z2;
            if (cLArrayAYN3 != null && cLArrayAYN3.size() != size) {
                throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", cLObject);
            }
            if (cLArrayAYN3 != null) {
                for (int i9 = 0; i9 < size; i9++) {
                    float fN = cLArrayAYN3.getFloat(i9);
                    if (z3) {
                        fN = transition.gh.n(fN);
                    }
                    typedBundleArr[i9].n(i8, fN);
                }
            } else {
                float fNY = cLObject.nY(str);
                if (!Float.isNaN(fNY)) {
                    if (z3) {
                        fNY = transition.gh.n(fNY);
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        typedBundleArr[i10].n(i8, fNY);
                    }
                }
            }
            i5++;
            z2 = z4;
        }
        boolean z5 = z2;
        int i11 = 0;
        CLElement cLElementE2 = cLObject.E2(JavetLibLoadingListener.JAVET_LIB_LOADING_TYPE_CUSTOM);
        if (cLElementE2 == null || !(cLElementE2 instanceof CLObject)) {
            customVariableArr = null;
        } else {
            CLObject cLObject3 = (CLObject) cLElementE2;
            int size2 = cLObject3.size();
            int size3 = cLArrayAYN.size();
            int[] iArr2 = new int[2];
            iArr2[z5 ? 1 : 0] = size2;
            iArr2[0] = size3;
            customVariableArr = (CustomVariable[][]) Array.newInstance((Class<?>) CustomVariable.class, iArr2);
            int i12 = 0;
            while (i12 < size2) {
                CLKey cLKey = (CLKey) cLObject3.XQ(i12);
                String strT = cLKey.t();
                if (cLKey.M7() instanceof CLArray) {
                    CLArray cLArray = (CLArray) cLKey.M7();
                    int size4 = cLArray.size();
                    if (size4 != size || size4 <= 0) {
                        cLObject2 = cLObject3;
                    } else {
                        int i13 = i11;
                        if (cLArray.XQ(i13) instanceof CLNumber) {
                            int i14 = i13;
                            while (i14 < size) {
                                customVariableArr[i14][i12] = new CustomVariable(strT, 901, cLArray.XQ(i14).J2());
                                i14++;
                                cLObject3 = cLObject3;
                            }
                            cLObject2 = cLObject3;
                        } else {
                            cLObject2 = cLObject3;
                            int i15 = 0;
                            while (i15 < size) {
                                long jKN = ConstraintSetParser.KN(cLArray.XQ(i15).t());
                                if (jKN != -1) {
                                    i2 = i15;
                                    customVariableArr[i15][i12] = new CustomVariable(strT, 902, (int) jKN);
                                } else {
                                    i2 = i15;
                                }
                                i15 = i2 + 1;
                            }
                        }
                    }
                } else {
                    cLObject2 = cLObject3;
                    CLElement cLElementM7 = cLKey.M7();
                    if (cLElementM7 instanceof CLNumber) {
                        float fJ2 = cLElementM7.J2();
                        for (int i16 = 0; i16 < size; i16++) {
                            customVariableArr[i16][i12] = new CustomVariable(strT, 901, fJ2);
                        }
                    } else {
                        long jKN2 = ConstraintSetParser.KN(cLElementM7.t());
                        if (jKN2 != -1) {
                            int i17 = 0;
                            while (i17 < size) {
                                customVariableArr[i17][i12] = new CustomVariable(strT, 902, (int) jKN2);
                                i17++;
                                size2 = size2;
                                jKN2 = jKN2;
                            }
                        }
                    }
                }
                i12++;
                size2 = size2;
                cLObject3 = cLObject2;
                i11 = 0;
            }
        }
        String strN2 = cLObject.N("curveFit");
        for (int i18 = 0; i18 < cLArrayAYN2.size(); i18++) {
            for (int i19 = 0; i19 < size; i19++) {
                String strE = cLArrayAYN2.e(i18);
                TypedBundle typedBundle = typedBundleArr[i19];
                if (strN2 != null) {
                    typedBundle.rl(508, n(strN2, "spline", "linear"));
                }
                typedBundle.O(501, strN);
                typedBundle.rl(100, cLArrayAYN.getInt(i19));
                transition.KN(strE, typedBundle, customVariableArr != null ? customVariableArr[i19] : null);
            }
        }
    }

    private static void xMQ(TypedBundle typedBundle, int i2, CLArray cLArray, int i3) {
        if (cLArray != null) {
            typedBundle.n(i2, cLArray.getFloat(i3));
        }
    }
}
