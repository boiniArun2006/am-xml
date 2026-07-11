package androidx.compose.foundation.gestures;

import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {337, 339, 385}, m = "detectZoom", n = {"$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", a.f62811a, "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "canceled"}, s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
final class TransformableKt$detectZoom$1 extends ContinuationImpl {
    int E2;
    Object J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f17198N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f17199O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    float f17200S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    /* synthetic */ Object f17201T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f17202X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    float f17203Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f17204e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f17205g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f17207o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f17208r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f17209t;

    TransformableKt$detectZoom$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17201T = obj;
        this.f17198N |= Integer.MIN_VALUE;
        return TransformableKt.Uo(null, false, null, null, this);
    }
}
