package yc;

import GK.j;
import LdY.Ml;
import QmE.j;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.Vector2D;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Kk1 {
    private final GK.j HI;
    private int Ik;
    private Vector2D J2;
    private Ml.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f75779O;
    private Vector2D Uo;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f75780Z;
    private final int az;
    private boolean ck;
    private final Lazy gh;
    private final Lazy mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SceneHolder f75781n;
    private boolean nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f75782o;
    private final Lazy qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f75783r;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final QmE.iF f75784t;
    private long ty;
    private final Lazy xMQ;

    public static final class j extends j.w6 {
        j() {
        }

        @Override // GK.j.n
        public boolean O(GK.j detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Kk1.this.f75779O = true;
            Kk1 kk1 = Kk1.this;
            Ml.j jVarUo = kk1.KN;
            if (jVarUo == null) {
                jVarUo = HW.C.Uo(Kk1.this.HI());
            }
            kk1.KN = jVarUo;
            Kk1.this.Uo = new Vector2D(detector.nr(), detector.O());
            return true;
        }

        @Override // GK.j.n
        public void nr(GK.j jVar) {
            if (Kk1.this.Z() && !Kk1.this.f75782o) {
                giR.t(Kk1.this.Ik(), true, RP.KN(Kk1.this.r().getUserPreviewMode()), Kk1.this.r().getSelection().getDirectSelection() != null);
            }
            Kk1.this.f75779O = false;
            Ml.j jVar2 = Kk1.this.KN;
            if (jVar2 != null) {
                jVar2.n();
            }
            Kk1.this.KN = null;
        }

        @Override // GK.j.n
        public boolean rl(GK.j detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            Vector2D vector2D = new Vector2D(detector.nr(), detector.O());
            Kk1.this.r().setUserPreviewMode(RP.gh(Kk1.this.r().getUserPreviewMode(), GeometryKt.plus(RP.rl(Kk1.this.r().getUserPreviewMode()), GeometryKt.div(GeometryKt.minus(vector2D, Kk1.this.Uo), RP.KN(Kk1.this.r().getUserPreviewMode()))), RangesKt.coerceIn(RP.KN(Kk1.this.r().getUserPreviewMode()) * detector.J2(), RP.Uo(), RP.J2())));
            Kk1.this.Uo = vector2D;
            Kk1.this.f75782o = false;
            return true;
        }
    }

    public Kk1(SceneHolder holder, Context context, QmE.iF eventLogger) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f75781n = holder;
        this.rl = context;
        this.f75784t = eventLogger;
        Vector2D.Companion companion = Vector2D.INSTANCE;
        this.J2 = companion.getZERO();
        this.Uo = companion.getZERO();
        this.xMQ = LazyKt.lazy(new Function0() { // from class: yc.MKd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Kk1.ViF(this.f75807n));
            }
        });
        this.mUb = LazyKt.lazy(new Function0() { // from class: yc.ya
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Kk1.az(this.f76172n));
            }
        });
        this.gh = LazyKt.lazy(new Function0() { // from class: yc.nH
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Kk1.ty());
            }
        });
        this.qie = LazyKt.lazy(new Function0() { // from class: yc.Lc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Kk1.aYN());
            }
        });
        this.az = ViewConfiguration.getLongPressTimeout();
        this.HI = new GK.j(context, new j());
    }

    private final int S() {
        return ((Number) this.xMQ.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ViF(Kk1 kk1) {
        return ViewConfiguration.get(kk1.rl).getScaledTouchSlop();
    }

    private final int XQ() {
        return ((Number) this.qie.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int az(Kk1 kk1) {
        return ViewConfiguration.get(kk1.rl).getScaledDoubleTapSlop();
    }

    private final int ck() {
        return ((Number) this.gh.getValue()).intValue();
    }

    public final Context HI() {
        return this.rl;
    }

    public final QmE.iF Ik() {
        return this.f75784t;
    }

    public final boolean WPU(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.ck && event.getActionMasked() != 0) {
            return false;
        }
        this.ck = false;
        if (!this.f75781n.getSelection().getSelectedElements().isEmpty() && !this.f75781n.getUserPreviewMode().KN()) {
            return false;
        }
        Vector2D vector2D = new Vector2D(event.getRawX(), event.getRawY());
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.Ik = 1;
            this.f75783r = 1;
            this.f75782o = true;
            this.nr = false;
            this.J2 = vector2D;
            this.f75780Z = false;
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                Vector2D vector2DMinus = GeometryKt.minus(vector2D, this.J2);
                if (this.Ik == 2 && !this.f75779O && !this.nr && (Math.abs(vector2DMinus.getX()) >= S() * 2 || Math.abs(vector2DMinus.getY()) >= S() * 2)) {
                    this.nr = true;
                }
                if (this.nr && !this.f75779O && !this.f75780Z && event.getEventTime() - event.getDownTime() > 150) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    this.HI.KN(motionEventObtain);
                    motionEventObtain.recycle();
                    this.f75780Z = true;
                }
                if (this.Ik == 2 && this.nr && !this.f75779O) {
                    SceneHolder sceneHolder = this.f75781n;
                    sceneHolder.setUserPreviewMode(RP.mUb(sceneHolder.getUserPreviewMode(), GeometryKt.plus(RP.rl(this.f75781n.getUserPreviewMode()), GeometryKt.div(vector2DMinus, RP.KN(this.f75781n.getUserPreviewMode())))));
                    this.J2 = vector2D;
                }
            } else if (actionMasked == 5) {
                int i2 = this.Ik + 1;
                this.Ik = i2;
                this.f75783r = Math.max(this.f75783r, i2);
            } else if (actionMasked == 6) {
                this.Ik--;
            }
        } else {
            if (event.getDownTime() - this.ty < ck() && this.f75782o && this.f75783r == 2) {
                Vector2D vector2DRl = RP.rl(this.f75781n.getUserPreviewMode());
                Vector2D.Companion companion = Vector2D.INSTANCE;
                if (Intrinsics.areEqual(vector2DRl, companion.getZERO()) && RP.KN(this.f75781n.getUserPreviewMode()) == 1.0f) {
                    SceneHolder sceneHolder2 = this.f75781n;
                    sceneHolder2.setUserPreviewMode(RP.xMQ(sceneHolder2.getUserPreviewMode()));
                    QmE.iF iFVar = this.f75784t;
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "restore");
                    Unit unit = Unit.INSTANCE;
                    iFVar.n(new j.fuX("preview_zoom_two_finger_double_tap", bundle));
                } else {
                    SceneHolder sceneHolder3 = this.f75781n;
                    sceneHolder3.setUserPreviewMode(RP.gh(RP.n(sceneHolder3.getUserPreviewMode()), companion.getZERO(), 1.0f));
                    QmE.iF iFVar2 = this.f75784t;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("type", "reset");
                    Unit unit2 = Unit.INSTANCE;
                    iFVar2.n(new j.fuX("preview_zoom_two_finger_double_tap", bundle2));
                }
                giR.t(this.f75784t, true, RP.KN(this.f75781n.getUserPreviewMode()), this.f75781n.getSelection().getDirectSelection() != null);
                this.HI.KN(event);
                return true;
            }
            if (!this.f75779O && event.getEventTime() - event.getDownTime() < XQ()) {
                this.ty = event.getEventTime();
            }
            if (this.nr) {
                giR.t(this.f75784t, true, RP.KN(this.f75781n.getUserPreviewMode()), this.f75781n.getSelection().getDirectSelection() != null);
                this.nr = false;
                return true;
            }
        }
        if (this.nr && this.f75780Z) {
            return true;
        }
        return this.HI.KN(event);
    }

    public final boolean Z() {
        return this.f75779O;
    }

    public final boolean o() {
        return this.nr || this.f75779O;
    }

    public final void qie() {
        if (this.ck) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.HI.KN(motionEventObtain);
        motionEventObtain.recycle();
        this.ck = true;
    }

    public final SceneHolder r() {
        return this.f75781n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int aYN() {
        return ViewConfiguration.getTapTimeout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ty() {
        return ViewConfiguration.getDoubleTapTimeout();
    }
}
