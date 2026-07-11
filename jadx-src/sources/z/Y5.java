package z;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.ImageCacheKt;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.QuaternionKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.userparam.TextureSrcType;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.gl.OpenGLException;
import com.safedk.android.analytics.brandsafety.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Y5 extends l3D {
    public static final int $stable = 8;
    private final VisualEffect visualEffect;

    /* JADX WARN: Multi-variable type inference failed */
    public final void render(C2470N geometry, g9s content, HI0.Q q2, KH gctx, Rectangle layerBounds, Transform layerTransform, Transform layerPrevTransform, Vector2D sceneSize, Vector2D projectSize, Vector2D viewSize, int i2, final Map<String, UserParameterValue> parameters, Map<String, ? extends g9s> buffers, g9s g9sVar, boolean z2, Matrix transMatrix) throws OpenGLException {
        Iterator it;
        SolidColor defaultValue;
        Vector3D defaultValue2;
        Quaternion defaultValue3;
        Vector3D defaultValue4;
        Vector2D defaultValue5;
        int i3;
        g9s g9sVarNr;
        HI0.Q contentResolver = q2;
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(gctx, "gctx");
        Intrinsics.checkNotNullParameter(layerBounds, "layerBounds");
        Intrinsics.checkNotNullParameter(layerTransform, "layerTransform");
        Intrinsics.checkNotNullParameter(layerPrevTransform, "layerPrevTransform");
        Intrinsics.checkNotNullParameter(sceneSize, "sceneSize");
        Intrinsics.checkNotNullParameter(projectSize, "projectSize");
        Intrinsics.checkNotNullParameter(viewSize, "viewSize");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(buffers, "buffers");
        Intrinsics.checkNotNullParameter(transMatrix, "transMatrix");
        AbstractC2478o.rl();
        useProgram();
        AbstractC2478o.rl();
        Vector3D location = layerTransform.getLocation();
        Vector2D size = layerBounds.getSize();
        Vector2D pivot = layerTransform.getPivot();
        Vector3D vector3DMinus = GeometryKt.minus(layerTransform.getLocation(), layerPrevTransform.getLocation());
        Vector2D vector2DInvertY = GeometryKt.invertY(new Vector2D(vector3DMinus.getX(), vector3DMinus.getY()));
        float rotation = layerTransform.getRotation() - layerPrevTransform.getRotation();
        float length = GeometryKt.getLength(GeometryKt.times(size, layerTransform.getScale())) - GeometryKt.getLength(GeometryKt.times(size, layerPrevTransform.getScale()));
        Iterator it2 = this.visualEffect.getParameters().iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            UserParameter userParameter = (UserParameter) it2.next();
            Vector2D vector2D = vector2DInvertY;
            if (userParameter instanceof UserParameter.Texture) {
                switch (i5) {
                    case 0:
                        i3 = 33984;
                        break;
                    case 1:
                        i3 = 33985;
                        break;
                    case 2:
                        i3 = 33986;
                        break;
                    case 3:
                        i3 = 33987;
                        break;
                    case 4:
                        i3 = 33988;
                        break;
                    case 5:
                        i3 = 33989;
                        break;
                    case 6:
                        i3 = 33990;
                        break;
                    case 7:
                        i3 = 33991;
                        break;
                    default:
                        throw new RuntimeException("Too many textures");
                }
                GLES20.glActiveTexture(i3);
                AbstractC2478o.rl();
                UserParameter.Texture texture = (UserParameter.Texture) userParameter;
                int i7 = j.$EnumSwitchMapping$0[texture.getSrcType().ordinal()];
                it = it2;
                if (i7 == 1) {
                    g9sVarNr = content;
                } else if (i7 == 2) {
                    g9sVarNr = buffers.get(texture.getName());
                } else if (i7 == 3) {
                    g9sVarNr = g9sVar;
                } else {
                    if (i7 != 4) {
                        throw new NotImplementedError("Not implemented " + texture.getSrcType());
                    }
                    Uri.Builder builderBuildUpon = this.visualEffect.getUri().buildUpon();
                    String src = texture.getSrc();
                    Intrinsics.checkNotNull(src);
                    Uri uriBuild = builderBuildUpon.appendPath(src).build();
                    Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
                    Bitmap bitmapLoadImageFromUri = ImageCacheKt.loadImageFromUri(contentResolver, uriBuild, true);
                    g9sVarNr = bitmapLoadImageFromUri != null ? gctx.nr(bitmapLoadImageFromUri, EnumC2480t.f76336O, i3) : null;
                }
                GLES20.glActiveTexture(i3);
                AbstractC2478o.rl();
                if (g9sVarNr != null) {
                    GLES20.glBindTexture(3553, g9sVarNr.o());
                }
                AbstractC2478o.rl();
                GLES20.glUniform1i(optionalUniform(texture.getName() + ".texture"), i5);
                AbstractC2478o.rl();
                GLES20.glUniform2f(optionalUniform(texture.getName() + ".size"), g9sVarNr != null ? g9sVarNr.getWidth() : 0, g9sVarNr != null ? g9sVarNr.getHeight() : 0);
                AbstractC2478o.rl();
                i5++;
            } else {
                it = it2;
                if (userParameter instanceof UserParameter.Selector) {
                    UserParameter.Selector selector = (UserParameter.Selector) userParameter;
                    int iOptionalUniform = optionalUniform(selector.getName());
                    UserParameterValue userParameterValue = parameters.get(selector.getName());
                    GLES20.glUniform1i(iOptionalUniform, userParameterValue != null ? userParameterValue.getIntValue() : selector.getDefaultChoice());
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.Switch) {
                    UserParameter.Switch r14 = (UserParameter.Switch) userParameter;
                    int iOptionalUniform2 = optionalUniform(r14.getName());
                    UserParameterValue userParameterValue2 = parameters.get(r14.getName());
                    GLES20.glUniform1i(iOptionalUniform2, userParameterValue2 != null ? userParameterValue2.getBooleanValue() : r14.getDefaultValue());
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.Slider) {
                    UserParameter.Slider slider = (UserParameter.Slider) userParameter;
                    int iOptionalUniform3 = optionalUniform(slider.getName());
                    UserParameterValue userParameterValue3 = parameters.get(slider.getName());
                    GLES20.glUniform1f(iOptionalUniform3, userParameterValue3 != null ? userParameterValue3.getFloatValue() : slider.getDefaultValue());
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.Spinner) {
                    UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                    int iOptionalUniform4 = optionalUniform(spinner.getName());
                    UserParameterValue userParameterValue4 = parameters.get(spinner.getName());
                    GLES20.glUniform1f(iOptionalUniform4, userParameterValue4 != null ? userParameterValue4.getFloatValue() : spinner.getDefaultValue());
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.HueRing) {
                    UserParameter.HueRing hueRing = (UserParameter.HueRing) userParameter;
                    int iOptionalUniform5 = optionalUniform(hueRing.getName());
                    UserParameterValue userParameterValue5 = parameters.get(hueRing.getName());
                    GLES20.glUniform1f(iOptionalUniform5, userParameterValue5 != null ? userParameterValue5.getFloatValue() : hueRing.getDefaultValue());
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.Point) {
                    UserParameter.Point point = (UserParameter.Point) userParameter;
                    UserParameterValue userParameterValue6 = parameters.get(point.getName());
                    if (userParameterValue6 == null || (defaultValue5 = userParameterValue6.getVec2DValue()) == null) {
                        defaultValue5 = point.getDefaultValue();
                    }
                    GLES20.glUniform2f(optionalUniform(point.getName()), defaultValue5.getX(), defaultValue5.getY());
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.XYZ) {
                    UserParameter.XYZ xyz = (UserParameter.XYZ) userParameter;
                    UserParameterValue userParameterValue7 = parameters.get(xyz.getName());
                    if (userParameterValue7 == null || (defaultValue4 = userParameterValue7.getVec3DValue()) == null) {
                        defaultValue4 = xyz.getDefaultValue();
                    }
                    GLES20.glUniform3f(optionalUniform(xyz.getName()), defaultValue4.getX(), defaultValue4.getY(), defaultValue4.getZ());
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.Orientation) {
                    UserParameter.Orientation orientation = (UserParameter.Orientation) userParameter;
                    UserParameterValue userParameterValue8 = parameters.get(orientation.getName());
                    if (userParameterValue8 == null || (defaultValue3 = userParameterValue8.getQuatValue()) == null) {
                        defaultValue3 = orientation.getDefaultValue();
                    }
                    GLES20.glUniformMatrix4fv(optionalUniform(orientation.getName()), 1, false, QuaternionKt.toMat4(defaultValue3), 0);
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.HueDisc) {
                    UserParameter.HueDisc hueDisc = (UserParameter.HueDisc) userParameter;
                    UserParameterValue userParameterValue9 = parameters.get(hueDisc.getName());
                    if (userParameterValue9 == null || (defaultValue2 = userParameterValue9.getVec3DValue()) == null) {
                        defaultValue2 = hueDisc.getDefaultValue();
                    }
                    GLES20.glUniform3f(optionalUniform(hueDisc.getName()), defaultValue2.getX(), defaultValue2.getY(), defaultValue2.getZ());
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.Color) {
                    UserParameter.Color color = (UserParameter.Color) userParameter;
                    UserParameterValue userParameterValue10 = parameters.get(color.getName());
                    if (userParameterValue10 == null || (defaultValue = userParameterValue10.getColorValue()) == null) {
                        defaultValue = color.getDefaultValue();
                    }
                    GLES20.glUniform4f(optionalUniform(color.getName()), defaultValue.getR(), defaultValue.getG(), defaultValue.getB(), defaultValue.getA());
                    AbstractC2478o.rl();
                } else if (userParameter instanceof UserParameter.FloatValue) {
                    UserParameter.FloatValue floatValue = (UserParameter.FloatValue) userParameter;
                    GLES20.glUniform1f(optionalUniform(floatValue.getName()), floatValue.getValue());
                    AbstractC2478o.rl();
                }
            }
            contentResolver = q2;
            vector2DInvertY = vector2D;
            it2 = it;
        }
        Vector2D vector2D2 = vector2DInvertY;
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acPreviewSize"), viewSize.getX(), viewSize.getY());
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acProjectSize"), projectSize.getX(), projectSize.getY());
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acScreenSize"), sceneSize.getX(), sceneSize.getY());
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acLayerCenter"), location.getX(), location.getY());
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acLayerCenterNorm"), location.getX() / sceneSize.getX(), (sceneSize.getY() - location.getY()) / sceneSize.getY());
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acLayerPivot"), pivot.getX(), pivot.getY());
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acLayerSize"), size.getX(), size.getY());
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acLayerScale"), layerTransform.getScale().getX(), layerTransform.getScale().getY());
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acLayerSizeNorm"), size.getX() / sceneSize.getX(), size.getY() / sceneSize.getY());
        AbstractC2478o.rl();
        GLES20.glUniform1f(optionalUniform("acTime"), gctx.S().nr());
        AbstractC2478o.rl();
        GLES20.glUniform1f(optionalUniform("acStartTime"), gctx.S().t());
        AbstractC2478o.rl();
        GLES20.glUniform1f(optionalUniform("acEndTime"), gctx.S().rl());
        AbstractC2478o.rl();
        GLES20.glUniform1i(optionalUniform("acPass"), i2);
        AbstractC2478o.rl();
        GLES20.glUniform2f(optionalUniform("acVelocity"), vector2D2.getX(), vector2D2.getY());
        AbstractC2478o.rl();
        GLES20.glUniform1f(optionalUniform("acAngularVelocity"), rotation);
        AbstractC2478o.rl();
        GLES20.glUniform1f(optionalUniform("acScaleVelocity"), length);
        AbstractC2478o.rl();
        GLES20.glUniform1i(optionalUniform("acShowGuides"), z2 ? 1 : 0);
        AbstractC2478o.rl();
        XoT.C.Uo(this, new Function0() { // from class: z.IG
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Y5.render$lambda$3(parameters, this);
            }
        });
        if (!parameters.containsKey("acIter") || this.visualEffect.getIterParam() == null) {
            GLES20.glUniform1i(optionalUniform("acIter"), -1);
        } else {
            XoT.C.Uo(this, new Function0() { // from class: z.FPL
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Y5.render$lambda$4(parameters);
                }
            });
            int iOptionalUniform6 = optionalUniform("acIter");
            UserParameterValue userParameterValue11 = parameters.get("acIter");
            GLES20.glUniform1i(iOptionalUniform6, userParameterValue11 != null ? userParameterValue11.getIntValue() : 0);
        }
        GLES20.glUniformMatrix3fv(optionalUniform("acLayerTransform"), 1, false, V.KN(layerTransform.getMatrix()), 0);
        AbstractC2478o.rl();
        GLES20.glUniformMatrix4fv(optionalUniform("acScreenToLayer"), 1, false, V.Z(V.HI(layerTransform, sceneSize, layerBounds, viewSize, viewSize, false, 16, null)), 0);
        AbstractC2478o.rl();
        GLES20.glUniformMatrix4fv(optionalUniform("acLayerToScreen"), 1, false, V.Z(V.az(layerTransform, sceneSize, layerBounds, viewSize, viewSize, false, 16, null)), 0);
        AbstractC2478o.rl();
        GLES20.glUniformMatrix4fv(optionalUniform("acTransform"), 1, false, GeometryKt.toGLMat4(transMatrix), 0);
        AbstractC2478o.rl();
        Matrix matrix = new Matrix();
        transMatrix.invert(matrix);
        GLES20.glUniformMatrix4fv(optionalUniform("acVtoRSpace"), 1, false, GeometryKt.toGLMat4(matrix), 0);
        geometry.mUb(attrib("ac_internal_position"), optionalAttrib("ac_internal_texcoord"), this.visualEffect.getId());
        AbstractC2478o.rl();
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextureSrcType.values().length];
            try {
                iArr[TextureSrcType.CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextureSrcType.BUFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextureSrcType.COMPOSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextureSrcType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(VisualEffect visualEffect, int i2) {
        super(V.XQ(visualEffect, i2), V.xMQ(visualEffect, i2), visualEffect.getId());
        Intrinsics.checkNotNullParameter(visualEffect, "visualEffect");
        this.visualEffect = visualEffect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String render$lambda$3(Map map, Y5 y5) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(entry.getKey() + l.ae + ((UserParameterValue) entry.getValue()).getDataType());
        }
        return "VES_parameters: " + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + " visualEffect.iterParam=" + y5.visualEffect.getIterParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String render$lambda$4(Map map) {
        UserParameterValue userParameterValue = (UserParameterValue) map.get("acIter");
        return "VES_parameters: acIter>>" + (userParameterValue != null ? Integer.valueOf(userParameterValue.getIntValue()) : null);
    }
}
