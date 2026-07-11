package Ij5;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import com.alightcreative.gl.egl.EGLException;
import dQG.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class I28 implements j.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f4298n;
    private final Map rl;

    public I28(Function2 eglFactory) {
        Intrinsics.checkNotNullParameter(eglFactory, "eglFactory");
        this.f4298n = eglFactory;
        this.rl = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n t(EGLDisplay display, j.Ml version) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(version, "version");
        return new n(display, version);
    }

    @Override // dQG.j.w6
    public dQG.j n(int i2) {
        Map map = this.rl;
        Integer numValueOf = Integer.valueOf(i2);
        Object obj = map.get(numValueOf);
        if (obj == null) {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(i2);
            if (!(eGLDisplayEglGetDisplay != EGL14.EGL_NO_DISPLAY)) {
                throw new EGLException(EGL14.eglGetError(), "eglGetDisplay");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                throw new EGLException(EGL14.eglGetError(), "eglInitialize");
            }
            Function2 function2 = this.f4298n;
            Intrinsics.checkNotNull(eGLDisplayEglGetDisplay);
            obj = (dQG.j) function2.invoke(eGLDisplayEglGetDisplay, new j.Ml(iArr[0], iArr[1]));
            map.put(numValueOf, obj);
        }
        return (dQG.j) obj;
    }

    public /* synthetic */ I28(Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new Function2() { // from class: Ij5.Ml
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return I28.t((EGLDisplay) obj, (j.Ml) obj2);
            }
        } : function2);
    }
}
