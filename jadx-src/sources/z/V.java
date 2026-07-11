package z;

import android.opengl.Matrix;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.visualeffect.ShaderGroup;
import com.alightcreative.app.motion.scene.visualeffect.ShaderInfo;
import com.alightcreative.app.motion.scene.visualeffect.ShaderPrecision;
import com.alightcreative.app.motion.scene.visualeffect.ShaderType;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.gl.ShaderCompileError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class V {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f76285n = new float[32];

    private static final float[] qie(Transform transform, Vector2D vector2D, Rectangle rectangle, Vector2D vector2D2, Vector2D vector2D3, boolean z2) {
        float[] fArrTy = ty(transform, vector2D, rectangle, vector2D2, vector2D3, true);
        Vector2D skew = transform.getSkew();
        C2475j c2475j = C2475j.f76315n;
        Ik(c2475j, fArrTy, 0);
        if (z2) {
            o(c2475j, fArrTy, 0, -skew.getX(), -skew.getY());
        }
        return fArrTy;
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShaderPrecision.values().length];
            try {
                iArr[ShaderPrecision.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShaderPrecision.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShaderPrecision.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static /* synthetic */ float[] HI(Transform transform, Vector2D vector2D, Rectangle rectangle, Vector2D vector2D2, Vector2D vector2D3, boolean z2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        return ty(transform, vector2D, rectangle, vector2D2, vector2D3, z2);
    }

    public static final boolean Ik(C2475j c2475j, float[] m2, int i2) {
        boolean zInvertM;
        Intrinsics.checkNotNullParameter(c2475j, "<this>");
        Intrinsics.checkNotNullParameter(m2, "m");
        float[] fArr = f76285n;
        synchronized (fArr) {
            zInvertM = Matrix.invertM(fArr, 0, m2, 0);
            System.arraycopy(fArr, 0, m2, i2, 16);
        }
        return zInvertM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] KN(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence S(UserParameter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "uniform " + UserParameterKt.getGlslType(it) + " " + it.getName() + ";";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String WPU(String str) {
        return "shader source: " + str;
    }

    public static final h XQ(VisualEffect visualEffect, int i2) {
        String source;
        Map<ShaderType, ShaderInfo> shaders;
        ShaderInfo shaderInfo;
        Intrinsics.checkNotNullParameter(visualEffect, "visualEffect");
        List<UserParameter> parameters = visualEffect.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            UserParameter userParameter = (UserParameter) obj;
            if (!(userParameter instanceof UserParameter.Texture) && UserParameterKt.getGlslType(userParameter).length() > 0) {
                arrayList.add(obj);
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, new Function1() { // from class: z.dT
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return V.S((UserParameter) obj2);
            }
        }, 30, null);
        ShaderGroup shaderGroup = visualEffect.getShaderGroups().get(Integer.valueOf(i2));
        if (shaderGroup == null || (shaders = shaderGroup.getShaders()) == null || (shaderInfo = shaders.get(ShaderType.VERTEX)) == null || (source = shaderInfo.getSource()) == null) {
            source = "void main() {\n    vertShaderInit();\n}";
        }
        final String str = "#version 100\n\nattribute vec4 ac_internal_position;\nattribute vec2 ac_internal_texcoord;\nvarying vec2 acScreenNorm;\nvarying vec2 acLayerNorm;\nuniform mat4 acTransform;\nuniform mat4 acScreenToLayer;\n\nvoid vertShaderInit() {\n    gl_Position = ac_internal_position;\n    acScreenNorm = (vec4(ac_internal_texcoord,0.0,1.0) * acTransform).xy;\n    acLayerNorm = (vec4(acScreenNorm,0.0,1.0) * acScreenToLayer).xy;\n}\n" + strJoinToString$default + "\n\n" + source;
        XoT.C.KN("vertexShaderFor", new Function0() { // from class: z.AZy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V.WPU(str);
            }
        });
        return new h(str, visualEffect.getId() + ".vert", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] Z(float[] fArr) {
        float[] fArr2 = new float[16];
        Matrix.transposeM(fArr2, 0, fArr, 0);
        return fArr2;
    }

    static /* synthetic */ float[] az(Transform transform, Vector2D vector2D, Rectangle rectangle, Vector2D vector2D2, Vector2D vector2D3, boolean z2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z2 = true;
        }
        return qie(transform, vector2D, rectangle, vector2D2, vector2D3, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh(String str) {
        return "shader source: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence mUb(UserParameter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "uniform " + UserParameterKt.getGlslType(it) + " " + it.getName() + ";";
    }

    public static final void o(C2475j c2475j, float[] m2, int i2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(c2475j, "<this>");
        Intrinsics.checkNotNullParameter(m2, "m");
        float[] fArr = f76285n;
        synchronized (fArr) {
            r(c2475j, fArr, 0, f3, f4);
            Matrix.multiplyMM(fArr, 16, m2, i2, fArr, 0);
            System.arraycopy(fArr, 16, m2, i2, 16);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void r(C2475j c2475j, float[] m2, int i2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(c2475j, "<this>");
        Intrinsics.checkNotNullParameter(m2, "m");
        Matrix.setIdentityM(m2, i2);
        m2[4] = (float) Math.tan(f3);
        m2[1] = (float) Math.tan(f4);
    }

    private static final float[] ty(Transform transform, Vector2D vector2D, final Rectangle rectangle, Vector2D vector2D2, Vector2D vector2D3, boolean z2) {
        float[] fArr = new float[16];
        Vector2D size = rectangle.getSize();
        Vector2D vector2DRecip = GeometryKt.recip(transform.getScale());
        Vector2D skew = transform.getSkew();
        Vector3D vector3DPlus = GeometryKt.plus(transform.getLocation(), GeometryKt.times(rectangle.getCenter(), transform.getScale()));
        Vector2D vector2DUnaryMinus = GeometryKt.unaryMinus(GeometryKt.invertY(GeometryKt.div(new Vector2D(vector3DPlus.getX(), vector3DPlus.getY()), vector2D)));
        XoT.C.Uo(transform, new Function0() { // from class: z.S
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V.ck(rectangle);
            }
        });
        Vector2D vector2DTimes = GeometryKt.times(GeometryKt.invertY(GeometryKt.div(transform.getPivot(), vector2D)), GeometryKt.div(vector2D, size));
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.translateM(fArr, 0, vector2DTimes.getX(), vector2DTimes.getY(), 0.0f);
        if (z2) {
            o(C2475j.f76315n, fArr, 0, skew.getX(), skew.getY());
        }
        Matrix.scaleM(fArr, 0, vector2DRecip.getX(), vector2DRecip.getY(), 1.0f);
        Matrix.scaleM(fArr, 0, size.getY() / size.getX(), 1.0f, 1.0f);
        Matrix.rotateM(fArr, 0, transform.getRotation(), 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr, 0, size.getX() / size.getY(), 1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -vector2DTimes.getX(), -vector2DTimes.getY(), 0.0f);
        Matrix.scaleM(fArr, 0, vector2D.getX() / size.getX(), vector2D.getY() / size.getY(), 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        Matrix.translateM(fArr, 0, vector2DUnaryMinus.getX(), vector2DUnaryMinus.getY(), 0.0f);
        Matrix.translateM(fArr, 0, 0.5f, -0.5f, 0.0f);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, vector2D2.getX() / vector2D3.getX(), vector2D2.getY() / vector2D3.getY(), 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        return fArr;
    }

    public static final Pl xMQ(VisualEffect visualEffect, int i2) {
        ShaderPrecision precision;
        String str;
        String source;
        Map<ShaderType, ShaderInfo> shaders;
        ShaderInfo shaderInfo;
        Map<ShaderType, ShaderInfo> shaders2;
        ShaderInfo shaderInfo2;
        Intrinsics.checkNotNullParameter(visualEffect, "visualEffect");
        ShaderGroup shaderGroup = visualEffect.getShaderGroups().get(Integer.valueOf(i2));
        if (shaderGroup == null || (shaders2 = shaderGroup.getShaders()) == null || (shaderInfo2 = shaders2.get(ShaderType.FRAGMENT)) == null || (precision = shaderInfo2.getPrecision()) == null) {
            precision = ShaderPrecision.MEDIUM;
        }
        int i3 = j.$EnumSwitchMapping$0[precision.ordinal()];
        if (i3 == 1) {
            str = "lowp";
        } else if (i3 == 2) {
            str = "mediump";
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "highp";
        }
        String strTrimIndent = StringsKt.trimIndent("\n        #version 100\n        precision " + str + " float;\n        uniform vec2 acProjectSize;\n        uniform vec2 acScreenSize;\n        uniform vec2 acPreviewSize;\n        uniform vec2 acLayerScale;\n        uniform vec2 acLayerCenter;\n        uniform vec2 acLayerCenterNorm;\n        uniform vec2 acLayerPivot;\n        uniform vec2 acLayerSize;\n        uniform vec2 acLayerSizeNorm;\n        uniform vec2 acVelocity;\n        uniform float acAngularVelocity;\n        uniform float acScaleVelocity;\n        uniform float acTime;\n        uniform float acStartTime;\n        uniform float acEndTime;\n        uniform int acPass;\n        uniform int acIter;\n        uniform mat3 acLayerTransform;\n        uniform mat4 acScreenToLayer;\n        uniform mat4 acLayerToScreen;\n        uniform mat4 acVtoRSpace;\n        uniform bool acShowGuides;\n\n        varying vec2 acScreenNorm;\n        varying vec2 acLayerNorm;\n\n        struct AC_ImageInfo {\n            sampler2D texture;\n            vec2 size;\n        };\n        \n        vec4 texture2DCv(sampler2D texture, vec2 position) {\n            vec2 rSpace = (vec4(position.xy, 0, 1) * acVtoRSpace).xy;\n            return texture2D(texture,rSpace);\n        }\n        \n        vec2 getTexSize(vec2 size) {\n            vec2 rSpace = (vec4(size.xy, 0, 1) * acVtoRSpace).xy;\n            return rSpace;\n        }\n    ");
        List<UserParameter> parameters = visualEffect.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (UserParameterKt.getGlslType((UserParameter) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, new Function1() { // from class: z.nSC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return V.mUb((UserParameter) obj2);
            }
        }, 30, null);
        ShaderGroup shaderGroup2 = visualEffect.getShaderGroups().get(Integer.valueOf(i2));
        if (shaderGroup2 == null || (shaders = shaderGroup2.getShaders()) == null || (shaderInfo = shaders.get(ShaderType.FRAGMENT)) == null || (source = shaderInfo.getSource()) == null) {
            source = "void main() {\n    gl_FragColor = vec4(0.5, 0.5, 0.5, 1.0);\n}";
        }
        final String str2 = strTrimIndent + "\n" + strJoinToString$default + "\n\n" + source;
        String str3 = strTrimIndent + "\n\nint max(int a, int b) {\n    return int(max(float(a),float(b)));\n}\n\nint abs(int a) {\n    return int(abs(float(a)));\n}\n\nint min(int a, int b) {\n    return int(min(float(a),float(b)));\n}\n\nint clamp(int a, int b, int c) {\n    return int(clamp(float(a),float(b),float(c)));\n}\n\nvec2 saturate(vec2 v) {\n    return clamp(v,0.,1.);\n}\n\nvec3 saturate(vec3 v) {\n    return clamp(v,0.,1.);\n}\n\nvec4 saturate(vec4 v) {\n    return clamp(v,0.,1.);\n}\n\nfloat saturate(float v) {\n    return clamp(v,0.,1.);\n}\n\n" + strJoinToString$default + "\n\n" + source;
        XoT.C.KN("combinedSource", new Function0() { // from class: z.ozJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V.gh(str2);
            }
        });
        try {
            return new Pl(str2, visualEffect.getId() + ".frag", false, 4, null);
        } catch (ShaderCompileError unused) {
            new Pl(str3, visualEffect.getId() + ".frag", true);
            try {
                return new Pl(str3, visualEffect.getId() + ".frag", true);
            } catch (ShaderCompileError e2) {
                List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{"'min'", "'max'", "'clamp'", "'abs'"});
                if (listListOf == null || !listListOf.isEmpty()) {
                    for (String str4 : listListOf) {
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        if (StringsKt.contains$default((CharSequence) message, (CharSequence) str4, false, 2, (Object) null)) {
                            return new Pl(str3, visualEffect.getId() + ".frag", true);
                        }
                    }
                }
                return new Pl(str2, visualEffect.getId() + ".frag", false, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck(Rectangle rectangle) {
        return "getScreenToLayerMatrixGL: layerBounds.center=" + rectangle.getCenter();
    }
}
