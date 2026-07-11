package z;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.alightcreative.gl.GLPBufferContext;
import com.alightcreative.gl.OpenGLException;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class YzO extends com.alightcreative.mediacore.naxyasync.o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GLPBufferContext f76287n;

    public YzO() {
        super(0L, false, 3, null);
        this.f76287n = new GLPBufferContext("stf");
        startWorker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, kotlin.Pair] */
    public static final Unit nY(Ref.ObjectRef objectRef, CountDownLatch countDownLatch) throws OpenGLException {
        int iO = Ew.O("SurfaceTextureFactory");
        SurfaceTexture surfaceTexture = new SurfaceTexture(iO);
        Surface surface = new Surface(surfaceTexture);
        surfaceTexture.detachFromGLContext();
        Ew.rl(iO);
        objectRef.element = new Pair(surfaceTexture, surface);
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair ViF() throws InterruptedException {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        runInWorker(new Function0() { // from class: z.M5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YzO.nY(objectRef, countDownLatch);
            }
        });
        countDownLatch.await();
        Pair pair = (Pair) objectRef.element;
        if (pair != null) {
            return pair;
        }
        throw new RuntimeException("Surface texture creation failed");
    }

    @Override // com.alightcreative.mediacore.naxyasync.o
    protected void onStart() throws GLPBufferContext.EGLException {
        this.f76287n.gh();
    }

    @Override // com.alightcreative.mediacore.naxyasync.o
    protected void onStop() {
        this.f76287n.az();
    }

    @Override // com.alightcreative.mediacore.naxyasync.o
    protected void doWork() {
        allowSleepUntilCommand();
    }
}
