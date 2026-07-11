package z;

import android.opengl.GLES20;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderCompileError;
import com.alightcreative.gl.ShaderSourceLoader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0017\u0010$\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lz/l3D;", "", "Lz/h;", "vertexShader", "Lz/Pl;", "fragmentShader", "", "tag", "<init>", "(Lz/h;Lz/Pl;Ljava/lang/String;)V", "Lcom/alightcreative/gl/ShaderSourceLoader;", "sourceLoader", "(Lcom/alightcreative/gl/ShaderSourceLoader;Ljava/lang/String;)V", "vertexTag", "fragmentTag", "(Lcom/alightcreative/gl/ShaderSourceLoader;Ljava/lang/String;Ljava/lang/String;)V", "", "release", "()V", "useProgram", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "attrib", "(Ljava/lang/String;)I", "optionalAttrib", "uniform", "optionalUniform", "Lz/h;", "Lz/Pl;", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "", "attribs", "Ljava/util/Map;", "uniforms", "programId", "I", "getProgramId", "()I", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGLShader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GLShader.kt\ncom/alightcreative/gl/GLProgram\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,604:1\n381#2,3:605\n384#2,4:609\n381#2,7:613\n381#2,7:620\n381#2,7:627\n1#3:608\n*S KotlinDebug\n*F\n+ 1 GLShader.kt\ncom/alightcreative/gl/GLProgram\n*L\n164#1:605,3\n164#1:609,4\n168#1:613,7\n170#1:620,7\n174#1:627,7\n*E\n"})
public abstract class l3D {
    public static final int $stable = 8;
    private final Map<String, Integer> attribs;
    private final Pl fragmentShader;
    private final int programId;
    private final String tag;
    private final Map<String, Integer> uniforms;
    private final h vertexShader;

    public l3D(h vertexShader, Pl fragmentShader, String tag) throws OpenGLException, ShaderCompileError {
        Intrinsics.checkNotNullParameter(vertexShader, "vertexShader");
        Intrinsics.checkNotNullParameter(fragmentShader, "fragmentShader");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.vertexShader = vertexShader;
        this.fragmentShader = fragmentShader;
        this.tag = tag;
        this.attribs = new LinkedHashMap();
        this.uniforms = new LinkedHashMap();
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.programId = iGlCreateProgram;
        AbstractC2478o.rl();
        if (iGlCreateProgram == 0) {
            throw new IllegalStateException("Check failed.");
        }
        GLES20.glAttachShader(iGlCreateProgram, vertexShader.n());
        AbstractC2478o.rl();
        GLES20.glAttachShader(iGlCreateProgram, fragmentShader.n());
        AbstractC2478o.rl();
        GLES20.glLinkProgram(iGlCreateProgram);
        AbstractC2478o.rl();
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return;
        }
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
        GLES20.glDeleteProgram(iGlCreateProgram);
        throw new ShaderCompileError("Error linking shader program '" + tag + "': " + strGlGetProgramInfoLog);
    }

    public final int attrib(String name) throws OpenGLException {
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, Integer> map = this.attribs;
        Integer numValueOf = map.get(name);
        if (numValueOf == null) {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.programId, name);
            if (iGlGetAttribLocation == -1) {
                throw new OpenGLException("Attribute '" + name + "' not found!");
            }
            numValueOf = Integer.valueOf(iGlGetAttribLocation);
            map.put(name, numValueOf);
        }
        return numValueOf.intValue();
    }

    public final int getProgramId() {
        return this.programId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int optionalAttrib(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, Integer> map = this.attribs;
        Integer numValueOf = map.get(name);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(GLES20.glGetAttribLocation(this.programId, name));
            map.put(name, numValueOf);
        }
        return numValueOf.intValue();
    }

    public final int optionalUniform(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, Integer> map = this.uniforms;
        Integer numValueOf = map.get(name);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(GLES20.glGetUniformLocation(this.programId, name));
            map.put(name, numValueOf);
        }
        return numValueOf.intValue();
    }

    public final void release() throws OpenGLException {
        if (!GLES20.glIsProgram(this.programId)) {
            throw new IllegalStateException("Check failed.");
        }
        GLES20.glDeleteProgram(this.programId);
        AbstractC2478o.rl();
        this.vertexShader.rl();
        this.fragmentShader.rl();
    }

    public final int uniform(String name) throws OpenGLException {
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, Integer> map = this.uniforms;
        Integer numValueOf = map.get(name);
        if (numValueOf == null) {
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.programId, name);
            if (iGlGetUniformLocation == -1) {
                throw new OpenGLException("Uniform '" + name + "' not found!");
            }
            numValueOf = Integer.valueOf(iGlGetUniformLocation);
            map.put(name, numValueOf);
        }
        return numValueOf.intValue();
    }

    public final void useProgram() throws OpenGLException {
        AbstractC2478o.rl();
        GLES20.glUseProgram(this.programId);
        AbstractC2478o.rl();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l3D(ShaderSourceLoader sourceLoader, String tag) {
        this(new h(sourceLoader.getSource(tag + ".vert"), tag, false, 4, null), new Pl(sourceLoader.getSource(tag + ".frag"), tag, false, 4, null), tag);
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l3D(ShaderSourceLoader sourceLoader, String vertexTag, String fragmentTag) {
        this(new h(sourceLoader.getSource(vertexTag + ".vert"), vertexTag, false, 4, null), new Pl(sourceLoader.getSource(fragmentTag + ".frag"), fragmentTag, false, 4, null), vertexTag + "/" + fragmentTag);
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(vertexTag, "vertexTag");
        Intrinsics.checkNotNullParameter(fragmentTag, "fragmentTag");
    }
}
