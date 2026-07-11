package yc;

import LdY.Ml;
import SJ0.C1454b;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import com.alightcreative.app.motion.activities.edit.widgets.n;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneHolderState;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import yc.mz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class mz extends RecyclerView.Adapter implements J {
    public static final j Ik = new j(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f76029r = 8;
    private long HI;
    private TimelineLayoutManager J2;
    private RecyclerView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f76030O;
    private Scene Uo;
    private Runnable az;
    private int ck;
    private Function1 gh;
    private Function1 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SceneHolder f76031n;
    private Set nr;
    private final Function1 qie;
    private final SceneThumbnailMaker rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function0 f76032t;
    private float ty;
    private Function1 xMQ;

    public static final class I28 implements View.OnTouchListener {
        private boolean E2;
        private int J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ AbstractC2448d f76033N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f76034O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private boolean f76035S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ float f76036T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ SceneElement f76037X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private Function2 f76038Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f76040g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f76041n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f76042o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f76043r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f76044t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ float f76045v;

        I28(SceneElement sceneElement, float f3, AbstractC2448d abstractC2448d, float f4) {
            this.f76037X = sceneElement;
            this.f76036T = f3;
            this.f76033N = abstractC2448d;
            this.f76045v = f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit HI(float f3, float f4) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Ik(mz mzVar, RecyclerView.ViewHolder it) {
            C1454b c1454bQie;
            AppCompatImageButton appCompatImageButton;
            Intrinsics.checkNotNullParameter(it, "it");
            Ch ch = it instanceof Ch ? (Ch) it : null;
            if (ch != null && (c1454bQie = ch.qie()) != null && (appCompatImageButton = c1454bQie.f9413O) != null) {
                appCompatImageButton.setVisibility(mzVar.nr.isEmpty() ? 0 : 4);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Z(mz mzVar, RecyclerView.ViewHolder it) {
            C1454b c1454bQie;
            AppCompatImageButton appCompatImageButton;
            Intrinsics.checkNotNullParameter(it, "it");
            Ch ch = it instanceof Ch ? (Ch) it : null;
            if (ch != null && (c1454bQie = ch.qie()) != null && (appCompatImageButton = c1454bQie.f9413O) != null) {
                appCompatImageButton.setVisibility(mzVar.nr.isEmpty() ? 0 : 4);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit az(mz mzVar, RecyclerView.ViewHolder it) {
            C1454b c1454bQie;
            AppCompatImageButton appCompatImageButton;
            Intrinsics.checkNotNullParameter(it, "it");
            Ch ch = it instanceof Ch ? (Ch) it : null;
            if (ch != null && (c1454bQie = ch.qie()) != null && (appCompatImageButton = c1454bQie.f9413O) != null) {
                appCompatImageButton.setVisibility(mzVar.nr.isEmpty() ? 0 : 4);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String ck() {
            return "Action Move";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void gh(int i2, I28 i28, View view, final mz mzVar, AbstractC2448d abstractC2448d, float f3, float f4) {
            if (i2 == i28.f76040g) {
                XoT.C.Uo(i28, new Function0() { // from class: yc.qYU
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mz.I28.qie();
                    }
                });
                ViewParent parent = view.getParent();
                if (parent == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(true);
                Ch ch = (Ch) abstractC2448d;
                if (mzVar.nr.contains(Long.valueOf(ch.getItemId()))) {
                    mzVar.nr = SetsKt.minus((Set<? extends Long>) mzVar.nr, Long.valueOf(ch.getItemId()));
                    ch.qie().getRoot().setActivated(false);
                    ch.qie().J2.setVisibility(0);
                    ch.qie().nr.setVisibility(4);
                    RecyclerView recyclerView = mzVar.KN;
                    if (recyclerView != null) {
                        com.alightcreative.widget.lS.n(recyclerView, new Function1() { // from class: yc.RGN
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return mz.I28.az(mzVar, (RecyclerView.ViewHolder) obj);
                            }
                        });
                    }
                    abstractC2448d.itemView.animate().translationX(-f3).setDuration(120L).start();
                } else {
                    mzVar.nr = SetsKt.plus((Set<? extends Long>) mzVar.nr, Long.valueOf(ch.getItemId()));
                    mzVar.fD().invoke(mzVar.nr);
                    i28.E2 = true;
                    ch.qie().getRoot().setActivated(true);
                    ch.qie().J2.setVisibility(4);
                    ch.qie().nr.setVisibility(0);
                    RecyclerView recyclerView2 = mzVar.KN;
                    if (recyclerView2 != null) {
                        com.alightcreative.widget.lS.n(recyclerView2, new Function1() { // from class: yc.B
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return mz.I28.ty(mzVar, (RecyclerView.ViewHolder) obj);
                            }
                        });
                    }
                    abstractC2448d.itemView.animate().translationX(-f4).setDuration(120L).start();
                    abstractC2448d.itemView.performHapticFeedback(0, 1);
                }
                mzVar.e().invoke(mzVar.nr);
                i28.f76035S = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(mz mzVar, RecyclerView.ViewHolder it) {
            C1454b c1454bQie;
            AppCompatImageButton appCompatImageButton;
            Intrinsics.checkNotNullParameter(it, "it");
            Ch ch = it instanceof Ch ? (Ch) it : null;
            if (ch != null && (c1454bQie = ch.qie()) != null && (appCompatImageButton = c1454bQie.f9413O) != null) {
                appCompatImageButton.setVisibility(mzVar.nr.isEmpty() ? 0 : 4);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String qie() {
            return "execute callback";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String r() {
            return "Action Up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ty(mz mzVar, RecyclerView.ViewHolder it) {
            C1454b c1454bQie;
            AppCompatImageButton appCompatImageButton;
            Intrinsics.checkNotNullParameter(it, "it");
            Ch ch = it instanceof Ch ? (Ch) it : null;
            if (ch != null && (c1454bQie = ch.qie()) != null && (appCompatImageButton = c1454bQie.f9413O) != null) {
                appCompatImageButton.setVisibility(mzVar.nr.isEmpty() ? 0 : 4);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(final View view, MotionEvent event) {
            Function2 function2;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            int actionMasked = event.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f76040g++;
                    XoT.C.Uo(this, new Function0() { // from class: yc.pq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return mz.I28.r();
                        }
                    });
                    this.f76038Z = null;
                    if (this.f76035S) {
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setTranslationZ(0.0f);
                    } else if (event.getActionMasked() != 3) {
                        if (mz.this.nr.contains(Long.valueOf(((Ch) this.f76033N).getItemId()))) {
                            mz mzVar = mz.this;
                            mzVar.nr = SetsKt.minus((Set<? extends Long>) mzVar.nr, Long.valueOf(((Ch) this.f76033N).getItemId()));
                            ((Ch) this.f76033N).qie().getRoot().setActivated(false);
                            ((Ch) this.f76033N).qie().J2.setVisibility(0);
                            ((Ch) this.f76033N).qie().nr.setVisibility(4);
                            RecyclerView recyclerView = mz.this.KN;
                            if (recyclerView != null) {
                                final mz mzVar2 = mz.this;
                                com.alightcreative.widget.lS.n(recyclerView, new Function1() { // from class: yc.kO4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return mz.I28.o(mzVar2, (RecyclerView.ViewHolder) obj);
                                    }
                                });
                            }
                            ((Ch) this.f76033N).qie().getRoot().animate().translationX(-this.f76045v).setDuration(120L).start();
                            mz.this.e().invoke(mz.this.nr);
                        } else if (!mz.this.nr.isEmpty()) {
                            mz mzVar3 = mz.this;
                            mzVar3.nr = SetsKt.plus((Set<? extends Long>) mzVar3.nr, Long.valueOf(((Ch) this.f76033N).getItemId()));
                            mz.this.fD().invoke(mz.this.nr);
                            ((Ch) this.f76033N).qie().getRoot().setActivated(true);
                            ((Ch) this.f76033N).qie().J2.setVisibility(4);
                            ((Ch) this.f76033N).qie().nr.setVisibility(0);
                            RecyclerView recyclerView2 = mz.this.KN;
                            if (recyclerView2 != null) {
                                final mz mzVar4 = mz.this;
                                com.alightcreative.widget.lS.n(recyclerView2, new Function1() { // from class: yc.hQ
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return mz.I28.Z(mzVar4, (RecyclerView.ViewHolder) obj);
                                    }
                                });
                            }
                            this.f76033N.itemView.animate().translationX(-this.f76036T).setDuration(120L).start();
                            mz.this.e().invoke(mz.this.nr);
                        } else if (Intrinsics.areEqual(view, ((Ch) this.f76033N).qie().f9413O)) {
                            mz.this.X().update(SceneElement.copy$default(this.f76037X, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, !r10.getHidden(), null, null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null));
                        } else {
                            mz.this.E2().invoke(Long.valueOf(((Ch) this.f76033N).getItemId()));
                        }
                    }
                } else if (actionMasked == 2) {
                    XoT.C.Uo(this, new Function0() { // from class: yc.R6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return mz.I28.ck();
                        }
                    });
                    if (this.E2) {
                        RecyclerView recyclerView3 = mz.this.KN;
                        View viewFindChildViewUnder = recyclerView3 != null ? recyclerView3.findChildViewUnder(event.getX() + view.getLeft(), event.getY() + view.getTop()) : null;
                        if (viewFindChildViewUnder != null) {
                            RecyclerView recyclerView4 = mz.this.KN;
                            RecyclerView.ViewHolder childViewHolder = recyclerView4 != null ? recyclerView4.getChildViewHolder(viewFindChildViewUnder) : null;
                            Ch ch = childViewHolder instanceof Ch ? (Ch) childViewHolder : null;
                            if (ch != null && !mz.this.nr.contains(Long.valueOf(ch.getItemId()))) {
                                mz mzVar5 = mz.this;
                                mzVar5.nr = SetsKt.plus((Set<? extends Long>) mzVar5.nr, Long.valueOf(ch.getItemId()));
                                ch.qie().getRoot().setActivated(true);
                                ch.qie().J2.setVisibility(4);
                                ch.qie().nr.setVisibility(0);
                                RecyclerView recyclerView5 = mz.this.KN;
                                if (recyclerView5 != null) {
                                    final mz mzVar6 = mz.this;
                                    com.alightcreative.widget.lS.n(recyclerView5, new Function1() { // from class: yc.RzR
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return mz.I28.Ik(mzVar6, (RecyclerView.ViewHolder) obj);
                                        }
                                    });
                                }
                                ch.qie().getRoot().animate().translationX(-this.f76036T).setDuration(120L).start();
                                ch.qie().getRoot().performHapticFeedback(3, 1);
                                mz.this.e().invoke(mz.this.nr);
                            }
                        }
                    } else if (this.f76035S && (function2 = this.f76038Z) != null) {
                        function2.invoke(Float.valueOf(event.getRawX()), Float.valueOf(event.getRawY()));
                    }
                } else if (actionMasked == 3) {
                }
            } else {
                this.f76035S = false;
                this.E2 = false;
                final int i2 = this.f76040g + 1;
                this.f76040g = i2;
                final mz mzVar7 = mz.this;
                final AbstractC2448d abstractC2448d = this.f76033N;
                final float f3 = this.f76045v;
                final float f4 = this.f76036T;
                view.postDelayed(new Runnable() { // from class: yc.FKk
                    @Override // java.lang.Runnable
                    public final void run() {
                        mz.I28.gh(i2, this, view, mzVar7, abstractC2448d, f3, f4);
                    }
                }, (((long) mz.this.f76030O) * ((long) 95)) / ((long) 100));
                this.f76041n = event.getRawX();
                this.f76044t = event.getRawY();
                this.f76034O = this.f76037X.getStartTime();
                int endTime = this.f76037X.getEndTime();
                this.J2 = endTime;
                this.f76043r = this.f76034O;
                this.f76042o = endTime;
                this.f76038Z = new Function2() { // from class: yc.Fl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return mz.I28.HI(((Float) obj).floatValue(), ((Float) obj2).floatValue());
                    }
                };
            }
            return true;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class Ml implements View.OnTouchListener {
        private Function2 E2;
        private int J2;
        final /* synthetic */ float M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f76046N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f76047O;
        final /* synthetic */ AbstractC2448d P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private int f76048S;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ TimelineLayoutManager f76050U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private int f76051X;
        final /* synthetic */ SceneElement Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private int f76052Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f76053e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Function2 f76054g;
        final /* synthetic */ float jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f76055n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f76058t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ mz f76059v;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Map f76057r = new LinkedHashMap();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Map f76056o = new LinkedHashMap();

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private HW.o f76049T = HW.Ml.f3896n;

        /* JADX INFO: Access modifiers changed from: private */
        public static final float ViF(float f3) {
            return (float) Math.sin(((double) f3) * 3.141592653589793d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float Z(float f3) {
            return (float) Math.sin(((double) f3) * 3.141592653589793d);
        }

        Ml(int i2, mz mzVar, SceneElement sceneElement, float f3, TimelineLayoutManager timelineLayoutManager, AbstractC2448d abstractC2448d, float f4) {
            this.f76046N = i2;
            this.f76059v = mzVar;
            this.Xw = sceneElement;
            this.jB = f3;
            this.f76050U = timelineLayoutManager;
            this.P5 = abstractC2448d;
            this.M7 = f4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit HI(mz mzVar, Ml ml, float f3, TimelineLayoutManager timelineLayoutManager, Ref.IntRef intRef, Ref.IntRef intRef2, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            RecyclerView recyclerView = mzVar.KN;
            Object obj = null;
            RecyclerView.ViewHolder childViewHolder = recyclerView != null ? recyclerView.getChildViewHolder(view) : null;
            if (childViewHolder != null && ml.f76057r.keySet().contains(Long.valueOf(childViewHolder.getItemId()))) {
                AbstractC2448d abstractC2448d = (AbstractC2448d) childViewHolder;
                if (abstractC2448d.Uo() == TimelineLayoutManager.j.EnumC0632j.f45185t) {
                    Iterator<T> it = mzVar.X().get_scene().getElements().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((SceneElement) next).getId() == abstractC2448d.getItemId()) {
                            obj = next;
                            break;
                        }
                    }
                    SceneElement sceneElement = (SceneElement) obj;
                    if (sceneElement != null) {
                        n nVar = (n) ml.f76057r.get(Long.valueOf(sceneElement.getId()));
                        if (nVar == null) {
                            return Unit.INSTANCE;
                        }
                        int iN = nVar.n() - nVar.rl();
                        int iRoundToFrameStartTime = TimeKt.roundToFrameStartTime(nVar.rl() + ((int) (((f3 - ml.f76055n) / timelineLayoutManager.jX()) * 1000.0f)), mzVar.X().get_scene().getFramesPerHundredSeconds());
                        ml.f76052Z = iRoundToFrameStartTime;
                        ml.f76048S = iN + iRoundToFrameStartTime;
                        intRef.element = Math.min(intRef.element, iRoundToFrameStartTime);
                        intRef2.element = Math.max(intRef2.element, ml.f76048S);
                        ml.f76056o.put(Long.valueOf(sceneElement.getId()), new n(ml.f76052Z, ml.f76048S));
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.LayoutParams");
                        TimelineLayoutManager.j jVar = (TimelineLayoutManager.j) layoutParams;
                        jVar.qie(ml.f76052Z);
                        jVar.xMQ(ml.f76048S);
                        view.setLayoutParams(jVar);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit S(mz mzVar, Ml ml, View v2) {
            Intrinsics.checkNotNullParameter(v2, "v");
            RecyclerView recyclerView = mzVar.KN;
            RecyclerView.ViewHolder childViewHolder = recyclerView != null ? recyclerView.getChildViewHolder(v2) : null;
            Iterator it = ml.f76056o.keySet().iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                if (childViewHolder != null && childViewHolder.getItemId() == jLongValue && ((AbstractC2448d) childViewHolder).Uo() == TimelineLayoutManager.j.EnumC0632j.f45185t) {
                    v2.setScaleX(1.0f);
                    v2.setScaleY(1.0f);
                    v2.setTranslationZ(0.0f);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String XQ() {
            return "Action Up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String aYN() {
            return "execute callback";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nY(Ml ml, TimelineLayoutManager timelineLayoutManager, mz mzVar, View view, float f3, float f4) {
            int i2 = ml.J2;
            int i3 = ml.f76047O;
            int iRoundToFrameStartTime = TimeKt.roundToFrameStartTime(i3 + ((int) (((f3 - ml.f76055n) / timelineLayoutManager.jX()) * 1000.0f)), mzVar.X().get_scene().getFramesPerHundredSeconds());
            ml.f76052Z = iRoundToFrameStartTime;
            ml.f76048S = iRoundToFrameStartTime + (i2 - i3);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.LayoutParams");
            TimelineLayoutManager.j jVar = (TimelineLayoutManager.j) layoutParams;
            jVar.qie(ml.f76052Z);
            jVar.xMQ(ml.f76048S);
            view.setLayoutParams(jVar);
            ml.f76049T.J2(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(ml.f76052Z - ml.f76047O, mzVar.X().get_scene().getFramesPerHundredSeconds()), mzVar.X().get_scene().getFramesPerHundredSeconds(), inFlMLxL.ZhWWWOS));
            ml.f76049T.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(ml.f76052Z, mzVar.X().get_scene().getFramesPerHundredSeconds()), mzVar.X().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"));
            timelineLayoutManager.i7(new n.j(SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(ml.f76047O, mzVar.X().get_scene().getFramesPerHundredSeconds())), Integer.valueOf(TimeKt.frameNumberFromStartTime(ml.J2, mzVar.X().get_scene().getFramesPerHundredSeconds()))}), SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(ml.f76052Z, mzVar.X().get_scene().getFramesPerHundredSeconds())), Integer.valueOf(TimeKt.frameNumberFromStartTime(ml.f76048S, mzVar.X().get_scene().getFramesPerHundredSeconds()))})));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(mz mzVar, Ml ml, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            RecyclerView recyclerView = mzVar.KN;
            RecyclerView.ViewHolder childViewHolder = recyclerView != null ? recyclerView.getChildViewHolder(it) : null;
            if (childViewHolder != null && ml.f76057r.keySet().contains(Long.valueOf(childViewHolder.getItemId())) && ((AbstractC2448d) childViewHolder).Uo() == TimelineLayoutManager.j.EnumC0632j.f45185t) {
                it.animate().scaleX(1.04f).scaleY(1.04f).setDuration(130L).setInterpolator(new TimeInterpolator() { // from class: yc.LEl
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f3) {
                        return mz.Ml.Z(f3);
                    }
                });
                it.setTranslationZ(10.0f);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ty(mz mzVar, Ml ml, Ref.IntRef intRef, TimelineLayoutManager timelineLayoutManager, Ref.IntRef intRef2, final float f3, float f4) {
            final mz mzVar2;
            final Ml ml2;
            final TimelineLayoutManager timelineLayoutManager2;
            final Ref.IntRef intRef3 = new Ref.IntRef();
            intRef3.element = Integer.MAX_VALUE;
            final Ref.IntRef intRef4 = new Ref.IntRef();
            intRef4.element = Integer.MIN_VALUE;
            RecyclerView recyclerView = mzVar.KN;
            if (recyclerView != null) {
                mzVar2 = mzVar;
                ml2 = ml;
                timelineLayoutManager2 = timelineLayoutManager;
                HI0.o7q.t(recyclerView, new Function1() { // from class: yc.YzO
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return mz.Ml.HI(mzVar2, ml2, f3, timelineLayoutManager2, intRef3, intRef4, (View) obj);
                    }
                });
            } else {
                mzVar2 = mzVar;
                ml2 = ml;
                timelineLayoutManager2 = timelineLayoutManager;
            }
            int framesPerHundredSeconds = mzVar2.X().get_scene().getFramesPerHundredSeconds();
            ml2.f76049T.J2(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(intRef3.element - intRef.element, framesPerHundredSeconds), framesPerHundredSeconds, "+mm:ss:ff"));
            ml2.f76049T.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(intRef3.element, framesPerHundredSeconds), framesPerHundredSeconds, "mm:ss:ff"));
            timelineLayoutManager2.i7(new n.j(SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(intRef.element, framesPerHundredSeconds)), Integer.valueOf(TimeKt.frameNumberFromStartTime(intRef2.element, framesPerHundredSeconds))}), SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(intRef3.element, framesPerHundredSeconds)), Integer.valueOf(TimeKt.frameNumberFromStartTime(intRef4.element, framesPerHundredSeconds))})));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(final View view, final MotionEvent event) {
            Object next;
            Object next2;
            final Ml ml = this;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                ml.f76053e = false;
                final int i2 = ml.f76051X + 1;
                ml.f76051X = i2;
                if (event.getY() + view.getY() < ml.f76046N) {
                    return false;
                }
                if (ml.f76059v.T()) {
                    final mz mzVar = ml.f76059v;
                    view.postDelayed(new Runnable() { // from class: yc.OU
                        @Override // java.lang.Runnable
                        public final void run() {
                            mz.Ml.r(view, i2, ml, mzVar);
                        }
                    }, (((long) ml.f76059v.f76030O) * ((long) 95)) / ((long) 100));
                } else {
                    final SceneElement sceneElement = ml.Xw;
                    final mz mzVar2 = ml.f76059v;
                    final TimelineLayoutManager timelineLayoutManager = ml.f76050U;
                    ml = this;
                    view.postDelayed(new Runnable() { // from class: yc.gnv
                        @Override // java.lang.Runnable
                        public final void run() {
                            mz.Ml.WPU(view, i2, this, sceneElement, mzVar2, timelineLayoutManager);
                        }
                    }, (((long) ml.f76059v.f76030O) * ((long) 95)) / ((long) 100));
                }
                ml.f76055n = event.getRawX();
                ml.f76058t = event.getRawY();
                ml.f76047O = ml.Xw.getStartTime();
                int endTime = ml.Xw.getEndTime();
                ml.J2 = endTime;
                ml.f76052Z = ml.f76047O;
                ml.f76048S = endTime;
                final TimelineLayoutManager timelineLayoutManager2 = ml.f76050U;
                final mz mzVar3 = ml.f76059v;
                ml.f76054g = new Function2() { // from class: yc.fg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return mz.Ml.nY(this.f75965n, timelineLayoutManager2, mzVar3, view, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                    }
                };
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = Integer.MAX_VALUE;
                final Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = Integer.MIN_VALUE;
                if (ml.f76059v.T()) {
                    Iterator it = ml.f76059v.nr.iterator();
                    while (it.hasNext()) {
                        long jLongValue = ((Number) it.next()).longValue();
                        Iterator<T> it2 = ml.f76059v.X().get_scene().getElements().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (((SceneElement) next).getId() == jLongValue) {
                                break;
                            }
                        }
                        SceneElement sceneElement2 = (SceneElement) next;
                        if (sceneElement2 != null) {
                            ml.f76057r.put(Long.valueOf(jLongValue), new n(sceneElement2.getStartTime(), sceneElement2.getEndTime()));
                            intRef.element = Math.min(intRef.element, sceneElement2.getStartTime());
                            intRef2.element = Math.max(intRef2.element, sceneElement2.getEndTime());
                        }
                    }
                    ml.f76049T.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(intRef.element, ml.f76059v.X().get_scene().getFramesPerHundredSeconds()), ml.f76059v.X().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"));
                }
                final mz mzVar4 = ml.f76059v;
                final Ml ml2 = ml;
                final TimelineLayoutManager timelineLayoutManager3 = ml2.f76050U;
                ml2.E2 = new Function2() { // from class: yc.KH
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return mz.Ml.ty(mzVar4, ml2, intRef, timelineLayoutManager3, intRef2, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                    }
                };
            } else if (actionMasked == 1) {
                Runnable runnable = ml.f76059v.az;
                if (runnable != null) {
                    mz mzVar5 = ml.f76059v;
                    RecyclerView recyclerView = mzVar5.KN;
                    if (recyclerView != null) {
                        recyclerView.removeCallbacks(runnable);
                    }
                    mzVar5.az = null;
                }
                ml.f76051X++;
                XoT.C.Uo(ml, new Function0() { // from class: yc.xZD
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mz.Ml.XQ();
                    }
                });
                ml.f76054g = null;
                ml.f76049T.dismiss();
                ml.f76050U.i7(n.w6.f45191n);
                RecyclerView recyclerView2 = ml.f76059v.KN;
                if (recyclerView2 != null) {
                    recyclerView2.requestLayout();
                }
                if (ml.f76053e) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setTranslationZ(0.0f);
                    if (event.getActionMasked() != 3) {
                        if (ml.f76059v.T()) {
                            Activity activityN = HW.qz.n(view);
                            Ml.j jVarJ2 = activityN != null ? HW.C.J2(activityN) : null;
                            Iterator it3 = ml.f76056o.keySet().iterator();
                            while (it3.hasNext()) {
                                long jLongValue2 = ((Number) it3.next()).longValue();
                                Iterator<T> it4 = ml.f76059v.X().get_scene().getElements().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it4.next();
                                    if (((SceneElement) next2).getId() == jLongValue2) {
                                        break;
                                    }
                                }
                                SceneElement sceneElement3 = (SceneElement) next2;
                                if (sceneElement3 != null) {
                                    n nVar = (n) ml.f76056o.get(Long.valueOf(jLongValue2));
                                    if (nVar == null) {
                                        return true;
                                    }
                                    if (sceneElement3.getStartTime() != nVar.rl() || sceneElement3.getEndTime() != nVar.n()) {
                                        ml.f76059v.X().update(SceneElement.copy$default(sceneElement3, null, nVar.rl(), nVar.n(), 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
                                    }
                                }
                            }
                            RecyclerView recyclerView3 = ml.f76059v.KN;
                            if (recyclerView3 != null) {
                                final mz mzVar6 = ml.f76059v;
                                HI0.o7q.t(recyclerView3, new Function1() { // from class: yc.M5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return mz.Ml.S(mzVar6, ml, (View) obj);
                                    }
                                });
                            }
                            ml.f76057r.clear();
                            ml.f76056o.clear();
                            if (jVarJ2 != null) {
                                jVarJ2.n();
                            }
                        } else if (ml.f76052Z != ml.f76047O || ml.f76048S != ml.J2) {
                            ml.f76059v.X().update(SceneElement.copy$default(ml.Xw, null, ml.f76052Z, ml.f76048S, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
                        }
                    }
                } else if (event.getActionMasked() != 3) {
                    ml.f76059v.E2().invoke(Long.valueOf(ml.P5.getItemId()));
                }
            } else if (actionMasked == 2) {
                RecyclerView recyclerView4 = ml.f76059v.KN;
                int left = recyclerView4 != null ? recyclerView4.getLeft() : 0;
                RecyclerView recyclerView5 = ml.f76059v.KN;
                int width = recyclerView5 != null ? recyclerView5.getWidth() : 1000;
                float rawX = event.getRawX() - left;
                if (ml.f76053e) {
                    float f3 = width;
                    float f4 = ml.jB;
                    if (rawX > f3 - f4) {
                        ml.f76059v.ty = RangesKt.coerceAtLeast((rawX - (f3 - f4)) / (f4 / 5.0f), 1.0f);
                        if (ml.f76059v.az == null) {
                            final mz mzVar7 = ml.f76059v;
                            final TimelineLayoutManager timelineLayoutManager4 = ml.f76050U;
                            final float f5 = ml.M7;
                            mzVar7.az = new Runnable() { // from class: yc.Mf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    mz.Ml.ck(timelineLayoutManager4, mzVar7, f5, ml, event);
                                }
                            };
                            Runnable runnable2 = ml.f76059v.az;
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }
                    } else if (rawX < f4) {
                        ml.f76059v.ty = RangesKt.coerceAtLeast((f4 - rawX) / (f4 / 5.0f), 1.0f);
                        if (ml.f76059v.az == null) {
                            final mz mzVar8 = ml.f76059v;
                            final TimelineLayoutManager timelineLayoutManager5 = ml.f76050U;
                            final float f6 = ml.M7;
                            mzVar8.az = new Runnable() { // from class: yc.o7q
                                @Override // java.lang.Runnable
                                public final void run() {
                                    mz.Ml.Ik(timelineLayoutManager5, mzVar8, f6, ml, event);
                                }
                            };
                            Runnable runnable3 = ml.f76059v.az;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    } else {
                        Runnable runnable4 = ml.f76059v.az;
                        if (runnable4 != null) {
                            mz mzVar9 = ml.f76059v;
                            RecyclerView recyclerView6 = mzVar9.KN;
                            if (recyclerView6 != null) {
                                recyclerView6.removeCallbacks(runnable4);
                            }
                            mzVar9.az = null;
                        }
                        if (ml.f76059v.T()) {
                            Function2 function2 = ml.E2;
                            if (function2 != null) {
                                function2.invoke(Float.valueOf(event.getRawX()), Float.valueOf(event.getRawY()));
                            }
                        } else {
                            Function2 function22 = ml.f76054g;
                            if (function22 != null) {
                                function22.invoke(Float.valueOf(event.getRawX()), Float.valueOf(event.getRawY()));
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Ik(TimelineLayoutManager timelineLayoutManager, mz mzVar, float f3, Ml ml, MotionEvent motionEvent) {
            RecyclerView recyclerView;
            int iGRh = timelineLayoutManager.GRh();
            RecyclerView recyclerView2 = mzVar.KN;
            if (recyclerView2 != null) {
                recyclerView2.scrollBy(-((int) ((f3 * mzVar.ty) / 60)), 0);
            }
            ml.f76055n -= timelineLayoutManager.GRh() - iGRh;
            if (mzVar.T()) {
                Function2 function2 = ml.E2;
                if (function2 != null) {
                    function2.invoke(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
                }
            } else {
                Function2 function22 = ml.f76054g;
                if (function22 != null) {
                    function22.invoke(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
                }
            }
            Runnable runnable = mzVar.az;
            if (runnable != null && (recyclerView = mzVar.KN) != null) {
                recyclerView.postOnAnimationDelayed(runnable, 16L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void WPU(View view, int i2, Ml ml, SceneElement sceneElement, mz mzVar, TimelineLayoutManager timelineLayoutManager) {
            HW.o oVarB;
            ViewParent parent = view.getParent();
            if (parent != null && i2 == ml.f76051X) {
                Activity activityN = HW.qz.n(view);
                if (activityN == null || (oVarB = HW.C.B(activityN)) == null) {
                    oVarB = HW.Ml.f3896n;
                }
                ml.f76049T = oVarB;
                oVarB.rl(2131231978);
                ml.f76049T.nr(2131231851);
                ml.f76049T.J2("+00:00:00");
                ml.f76049T.n(TimeKt.formatFrameNumber(TimeKt.frameNumberFromStartTime(sceneElement.getStartTime(), mzVar.X().get_scene().getFramesPerHundredSeconds()), mzVar.X().get_scene().getFramesPerHundredSeconds(), "mm:ss:ff"));
                XoT.C.Uo(ml, new Function0() { // from class: yc.QaP
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return mz.Ml.aYN();
                    }
                });
                parent.requestDisallowInterceptTouchEvent(true);
                view.animate().scaleX(1.04f).scaleY(1.04f).setDuration(130L).setInterpolator(new TimeInterpolator() { // from class: yc.p
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f3) {
                        return mz.Ml.ViF(f3);
                    }
                });
                view.setTranslationZ(10.0f);
                ml.f76053e = true;
                timelineLayoutManager.i7(new n.j(SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(ml.f76047O, mzVar.X().get_scene().getFramesPerHundredSeconds())), Integer.valueOf(TimeKt.frameNumberFromStartTime(ml.J2, mzVar.X().get_scene().getFramesPerHundredSeconds()))}), SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(TimeKt.frameNumberFromStartTime(ml.f76047O, mzVar.X().get_scene().getFramesPerHundredSeconds())), Integer.valueOf(TimeKt.frameNumberFromStartTime(ml.J2, mzVar.X().get_scene().getFramesPerHundredSeconds()))})));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ck(TimelineLayoutManager timelineLayoutManager, mz mzVar, float f3, Ml ml, MotionEvent motionEvent) {
            RecyclerView recyclerView;
            int iGRh = timelineLayoutManager.GRh();
            RecyclerView recyclerView2 = mzVar.KN;
            if (recyclerView2 != null) {
                recyclerView2.scrollBy((int) ((f3 * mzVar.ty) / 60), 0);
            }
            ml.f76055n -= timelineLayoutManager.GRh() - iGRh;
            if (mzVar.T()) {
                Function2 function2 = ml.E2;
                if (function2 != null) {
                    function2.invoke(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
                }
            } else {
                Function2 function22 = ml.f76054g;
                if (function22 != null) {
                    function22.invoke(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
                }
            }
            Runnable runnable = mzVar.az;
            if (runnable != null && (recyclerView = mzVar.KN) != null) {
                recyclerView.postOnAnimationDelayed(runnable, 16L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(View view, int i2, final Ml ml, final mz mzVar) {
            HW.o oVarB;
            ViewParent parent = view.getParent();
            if (parent != null && i2 == ml.f76051X) {
                Activity activityN = HW.qz.n(view);
                if (activityN == null || (oVarB = HW.C.B(activityN)) == null) {
                    oVarB = HW.Ml.f3896n;
                }
                ml.f76049T = oVarB;
                oVarB.rl(2131231978);
                ml.f76049T.nr(2131231851);
                ml.f76049T.J2("+00:00:00");
                ml.f76053e = true;
                parent.requestDisallowInterceptTouchEvent(true);
                RecyclerView recyclerView = mzVar.KN;
                if (recyclerView != null) {
                    HI0.o7q.t(recyclerView, new Function1() { // from class: yc.O
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return mz.Ml.o(mzVar, ml, (View) obj);
                        }
                    });
                }
            }
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f76060n;
        private final int rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f76060n == nVar.f76060n && this.rl == nVar.rl;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f76060n) * 31) + Integer.hashCode(this.rl);
        }

        public final int n() {
            return this.rl;
        }

        public final int rl() {
            return this.f76060n;
        }

        public String toString() {
            return "ElementTime(startTime=" + this.f76060n + ", endTime=" + this.rl + ")";
        }

        public n(int i2, int i3) {
            this.f76060n = i2;
            this.rl = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p5(Set set, mz mzVar) {
        return "setSelection(" + CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62, null) + ")  selectedItems=[" + CollectionsKt.joinToString$default(mzVar.nr, ",", null, null, 0, null, null, 62, null) + "]  NeedUpdate=" + (!Intrinsics.areEqual(set, mzVar.nr));
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimelineLayoutManager.j.EnumC0632j.values().length];
            try {
                iArr[TimelineLayoutManager.j.EnumC0632j.f45182n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineLayoutManager.j.EnumC0632j.f45181O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimelineLayoutManager.j.EnumC0632j.f45185t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mz(SceneHolder sceneHolder, SceneThumbnailMaker thumbnailMaker, Function0 getEditingKeyableProperties) {
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
        Intrinsics.checkNotNullParameter(getEditingKeyableProperties, "getEditingKeyableProperties");
        this.f76031n = sceneHolder;
        this.rl = thumbnailMaker;
        this.f76032t = getEditingKeyableProperties;
        this.nr = SetsKt.emptySet();
        this.f76030O = ViewConfiguration.getLongPressTimeout();
        this.Uo = sceneHolder.get_scene();
        this.xMQ = new Function1() { // from class: yc.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mz.bzg((Set) obj);
            }
        };
        this.mUb = new Function1() { // from class: yc.iF
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mz.v(((Long) obj).longValue());
            }
        };
        this.gh = new Function1() { // from class: yc.yg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mz.N((Set) obj);
            }
        };
        this.qie = new Function1() { // from class: yc.pO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mz.rV9((SceneHolderState) obj);
            }
        };
        setHasStableIds(true);
        sceneHolder.subscribe(new Function1() { // from class: yc.Sis
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mz.o(this.f75849n, (SceneHolderState) obj);
            }
        });
        this.ty = 1.0f;
        this.HI = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Set it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bzg(Set it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(mz mzVar, SceneHolderState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getScene() != mzVar.Uo) {
            mzVar.Uo = it.getScene();
            mzVar.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rV9(SceneHolderState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(long j2) {
        return Unit.INSTANCE;
    }

    public final Function1 E2() {
        return this.mUb;
    }

    @Override // yc.J
    public int J2(int i2) {
        return (this.f76031n.get_scene().getElements().size() - 1) - (i2 % this.f76031n.get_scene().getElements().size());
    }

    public final void M7(final Set selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        XoT.C.Uo(this, new Function0() { // from class: yc.l4Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mz.p5(selection, this);
            }
        });
        if (Intrinsics.areEqual(selection, this.nr)) {
            return;
        }
        this.nr = selection;
        this.xMQ.invoke(selection);
        notifyDataSetChanged();
    }

    public final void P5(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.xMQ = function1;
    }

    public final boolean T() {
        return !this.nr.isEmpty();
    }

    public final void U(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.mUb = function1;
    }

    public final SceneHolder X() {
        return this.f76031n;
    }

    public final void Xw() {
        List<SceneElement> elements = this.f76031n.get_scene().getElements();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((SceneElement) it.next()).getId()));
        }
        if (this.nr.size() != arrayList.size()) {
            Set set = CollectionsKt.toSet(arrayList);
            this.nr = set;
            this.xMQ.invoke(set);
            notifyDataSetChanged();
        }
    }

    public final Function1 e() {
        return this.xMQ;
    }

    public final Function1 fD() {
        return this.gh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f76031n.get_scene().getElements().size() * 4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        return this.f76031n.get_scene().getElements().get(i2 % this.f76031n.get_scene().getElements().size()).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        return i2 / this.f76031n.get_scene().getElements().size();
    }

    public final int iF(long j2) {
        Iterator<SceneElement> it = this.f76031n.get_scene().getElements().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getId() == j2) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return 0;
        }
        this.HI = j2;
        this.ck = 2;
        notifyDataSetChanged();
        return i2;
    }

    public final void jB(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.gh = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: nHg, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbstractC2448d holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int size = i2 % this.f76031n.get_scene().getElements().size();
        TimelineLayoutManager timelineLayoutManager = this.J2;
        if (timelineLayoutManager == null) {
            return;
        }
        SceneElement sceneElement = this.f76031n.get_scene().getElements().get(size);
        timelineLayoutManager.jE(null);
        Scene scene = this.f76031n.get_scene();
        int iJ2 = J2(size);
        SceneThumbnailMaker sceneThumbnailMaker = this.rl;
        Iterable iterable = (Iterable) this.f76032t.invoke();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            List keyframes = ((Keyable) ((oA.j) it.next()).get(sceneElement)).getKeyframes();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
            Iterator it2 = keyframes.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(((Keyframe) it2.next()).getTime()));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        long id = sceneElement.getId();
        Long mainCameraId = SceneKt.getMainCameraId(this.f76031n.get_scene());
        holder.nr(scene, sceneElement, iJ2, sceneThumbnailMaker, arrayList, 0, mainCameraId != null && id == mainCameraId.longValue());
        Log.d(mz.class.getSimpleName(), "bindViewHolder: holder.xitemId=" + holder.getItemId() + "  position=" + i2);
        holder.itemView.setActivated(this.nr.contains(Long.valueOf(holder.getItemId())));
        float dimension = holder.itemView.getContext().getResources().getDimension(2131166418);
        float dimension2 = holder.itemView.getContext().getResources().getDimension(2131166346);
        if (this.HI == holder.getItemId() && !SceneElementKt.hasAnyVideo(sceneElement) && this.ck > 0 && (holder.Uo() == TimelineLayoutManager.j.EnumC0632j.f45182n || holder.Uo() == TimelineLayoutManager.j.EnumC0632j.f45185t)) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(holder.itemView, "alpha", 0.0f, 1.0f);
            Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(600L);
            objectAnimatorOfFloat.start();
            int i3 = this.ck - 1;
            this.ck = i3;
            if (i3 <= 0) {
                this.HI = -1L;
            }
        }
        int dimensionPixelOffset = holder.itemView.getResources().getDimensionPixelOffset(2131166396);
        int i5 = w6.$EnumSwitchMapping$0[holder.Uo().ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                holder.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: yc.P
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return mz.s7N(this.f75826n, view, motionEvent);
                    }
                });
                return;
            } else {
                if (i5 != 3) {
                    return;
                }
                holder.itemView.setOnTouchListener(new Ml(dimensionPixelOffset, this, sceneElement, holder.itemView.getResources().getDimension(2131166389), timelineLayoutManager, holder, holder.itemView.getResources().getDimension(2131166390)));
                return;
            }
        }
        Ch ch = (Ch) holder;
        ch.qie().J2.setVisibility(this.nr.contains(Long.valueOf(ch.getItemId())) ? 4 : 0);
        ch.qie().getRoot().setTranslationX(this.nr.contains(Long.valueOf(ch.getItemId())) ? -dimension2 : -dimension);
        ch.qie().nr.setVisibility(this.nr.contains(Long.valueOf(ch.getItemId())) ? 0 : 4);
        ch.qie().f9413O.setVisibility(this.nr.isEmpty() ? 0 : 4);
        ch.qie().f9413O.setImageResource(sceneElement.getHidden() ? 2131232060 : 2131232058);
        ch.qie().f9413O.setAlpha(sceneElement.getHidden() ? 0.5f : 0.9f);
        ch.qie().Uo.setAlpha(sceneElement.getHidden() ? 0.6f : 1.0f);
        ch.qie().rl.setAlpha(sceneElement.getHidden() ? 0.5f : 1.0f);
        I28 i28 = new I28(sceneElement, dimension2, holder, dimension);
        ch.qie().getRoot().setOnTouchListener(i28);
        ch.qie().f9413O.setOnTouchListener(i28);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f76031n.subscribe(this.qie);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        this.J2 = layoutManager instanceof TimelineLayoutManager ? (TimelineLayoutManager) layoutManager : null;
        this.KN = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f76031n.unsubscribe(this.qie);
        this.J2 = null;
        this.KN = null;
    }

    @Override // yc.J
    public SceneElement rl(int i2) {
        return this.f76031n.get_scene().getElements().get(i2 % this.f76031n.get_scene().getElements().size());
    }

    public final void te() {
        if (this.nr.isEmpty()) {
            return;
        }
        Set setEmptySet = SetsKt.emptySet();
        this.nr = setEmptySet;
        this.xMQ.invoke(setEmptySet);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: wTp, reason: merged with bridge method [inline-methods] */
    public AbstractC2448d onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i2 == 0) {
            return new Z5b(new View(parent.getContext()));
        }
        if (i2 == 1) {
            SJ0.rd rdVarT = SJ0.rd.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(rdVarT, "inflate(...)");
            return new Fo(rdVarT);
        }
        if (i2 == 2) {
            C1454b c1454bT = C1454b.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(c1454bT, "inflate(...)");
            return new Ch(c1454bT);
        }
        if (i2 != 3) {
            throw new IllegalStateException();
        }
        SJ0.g62 g62VarT = SJ0.g62.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(g62VarT, "inflate(...)");
        return new ZX7(g62VarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s7N(mz mzVar, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && !mzVar.nr.isEmpty()) {
            mzVar.M7(SetsKt.emptySet());
        }
        return true;
    }

    @Override // yc.J
    public TimelineLayoutManager.j.EnumC0632j Uo(int i2) {
        int itemViewType = getItemViewType(i2);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType != 3) {
                        return TimelineLayoutManager.j.EnumC0632j.f45185t;
                    }
                    return TimelineLayoutManager.j.EnumC0632j.J2;
                }
                return TimelineLayoutManager.j.EnumC0632j.f45182n;
            }
            return TimelineLayoutManager.j.EnumC0632j.f45185t;
        }
        return TimelineLayoutManager.j.EnumC0632j.f45181O;
    }
}
