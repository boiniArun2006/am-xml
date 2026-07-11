package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Landroidx/constraintlayout/compose/BaseKeyFramesScope;", "", "Landroidx/constraintlayout/core/parser/CLObject;", c.f62177j, "Landroidx/constraintlayout/core/parser/CLObject;", "()Landroidx/constraintlayout/core/parser/CLObject;", "keyFramePropsObject", "Landroidx/constraintlayout/compose/FakeKeyFramesScope;", "Landroidx/constraintlayout/compose/KeyAttributesScope;", "Landroidx/constraintlayout/compose/KeyCyclesScope;", "Landroidx/constraintlayout/compose/KeyPositionsScope;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/BaseKeyFramesScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n1#2:970\n13579#3,2:971\n*S KotlinDebug\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/BaseKeyFramesScope\n*L\n286#1:971,2\n*E\n"})
public abstract class BaseKeyFramesScope {
    static final /* synthetic */ KProperty[] rl = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseKeyFramesScope.class, "easing", "getEasing()Landroidx/constraintlayout/compose/Easing;", 0))};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f34413t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CLObject keyFramePropsObject;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final CLObject getKeyFramePropsObject() {
        return this.keyFramePropsObject;
    }
}
