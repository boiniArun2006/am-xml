package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.fuX;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001a\u00020\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0015J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b,\u0010-J)\u00101\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u0010/\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b1\u00102J!\u00104\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001803H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b7\u00108J\"\u00109\u001a\u00020\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b9\u0010\u0013J\"\u0010:\u001a\u00020\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b:\u0010\u0013J\"\u0010;\u001a\u00020\u000f2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0016¢\u0006\u0004\b;\u0010\u0013J\u000f\u0010<\u001a\u00020\u000fH\u0000¢\u0006\u0004\b<\u0010\u0015J\u000f\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010\u0015J\u001d\u0010>\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001eH\u0016¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001eH\u0016¢\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\u00020\u000f2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bE\u0010$J\u0017\u0010F\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bF\u0010$J\u000f\u0010G\u001a\u00020\u001aH\u0016¢\u0006\u0004\bG\u0010HJ+\u0010M\u001a\u00020\u000f2\u001a\u0010L\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020K\u0012\u0006\u0012\u0004\u0018\u00010K0J0IH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u000fH\u0016¢\u0006\u0004\bS\u0010\u0015J\u000f\u0010T\u001a\u00020\u000fH\u0016¢\u0006\u0004\bT\u0010\u0015J\u000f\u0010U\u001a\u00020\u000fH\u0016¢\u0006\u0004\bU\u0010\u0015J\u000f\u0010V\u001a\u00020\u000fH\u0016¢\u0006\u0004\bV\u0010\u0015J\u000f\u0010W\u001a\u00020\u000fH\u0016¢\u0006\u0004\bW\u0010\u0015J5\u0010\\\u001a\u00028\u0000\"\u0004\b\u0000\u0010X2\b\u0010Y\u001a\u0004\u0018\u00010\u00012\u0006\u0010[\u001a\u00020Z2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\\\u0010]J!\u0010^\u001a\u0002002\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b`\u0010aJ\u001f\u0010b\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\bb\u0010cJ\u001b\u0010e\u001a\u00020\u000f2\n\u0010P\u001a\u0006\u0012\u0002\b\u00030dH\u0000¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u000fH\u0016¢\u0006\u0004\bg\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b=\u0010h\u001a\u0004\bi\u0010jR\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010kR(\u0010o\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180lj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0018`m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010nR\u0014\u0010r\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR \u0010w\u001a\b\u0012\u0004\u0012\u00020t0s8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b:\u0010u\u0012\u0004\bv\u0010\u0015R \u0010}\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\bF\u0010y\u0012\u0004\b|\u0010\u0015\u001a\u0004\bz\u0010{R'\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020)038\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001d\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020)0\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010\u0082\u0001R\u001d\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020)0\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0082\u0001R+\u0010\u0085\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030d038\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u007fR\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u0086\u0001R\u0017\u0010\u0088\u0001\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R(\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020)038\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u007fR*\u0010\u008c\u0001\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0018038\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u007fR-\u0010\u0091\u0001\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u001c\n\u0004\b7\u0010~\u0012\u0005\b\u0090\u0001\u0010\u0015\u001a\u0005\b\u008d\u0001\u0010H\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b4\u0010\u0093\u0001R\u001b\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b,\u0010\u0096\u0001R\u001a\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b<\u0010\u0098\u0001R\u0019\u0010\u009c\u0001\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010¡\u0001\u001a\u00030\u009d\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b\u0089\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¨\u0001\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010ª\u0001\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010~\u001a\u0005\bª\u0001\u0010HR\u0018\u0010¬\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010~R3\u0010²\u0001\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0005\b±\u0001\u0010\u0013R\u0016\u0010³\u0001\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010HR\u0013\u0010\u000b\u001a\u00020\n8F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010´\u0001R\u0016\u0010¶\u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010HR\u0015\u0010·\u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010HR\u0016\u0010¹\u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010H\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006º\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/runtime/PausableComposition;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "iF", "(Lkotlin/jvm/functions/Function2;)V", "fD", "()V", "E2", "e", "", "value", "", "forgetConditionalScopes", "ViF", "(Ljava/lang/Object;Z)V", "", IV8ValueMap.FUNCTION_VALUES, "nY", "(Ljava/util/Set;Z)V", "te", "wTp", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "g", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "jB", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/InvalidationResult;", "s7N", "(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "Landroidx/compose/runtime/collection/ScopeMap;", "Xw", "()Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/tooling/CompositionObserver;", "v", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "KN", "r", "nr", "U", c.f62177j, "HI", "(Ljava/util/Set;)V", "az", "(Ljava/util/Set;)Z", "block", "ty", "(Lkotlin/jvm/functions/Function0;)V", "t", "o", "qie", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "mUb", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", "state", "xMQ", "(Landroidx/compose/runtime/MovableContentState;)V", "ck", "O", "WPU", "S", "aYN", "R", "to", "", "groupIndex", "gh", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Uo", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "rl", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "bzg", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Landroidx/compose/runtime/DerivedState;", "rV9", "(Landroidx/compose/runtime/DerivedState;)V", "deactivate", "Landroidx/compose/runtime/CompositionContext;", "getParent", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "J2", "Ljava/lang/Object;", "lock", "", "Landroidx/compose/runtime/RememberObserver;", "Ljava/util/Set;", "getAbandonSet$annotations", "abandonSet", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/SlotTable;", "nHg", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "slotTable", "Z", "Landroidx/collection/MutableScatterMap;", "observations", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterSet;", "invalidatedScopes", "conditionallyInvalidatedScopes", "derivedStates", "Landroidx/compose/runtime/changelist/ChangeList;", "X", "lateChanges", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "observationsProcessed", "N", "invalidations", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "pendingInvalidScopes", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/compose/runtime/PausedCompositionImpl;", "Landroidx/compose/runtime/PausedCompositionImpl;", "pendingPausedComposition", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegate", "P5", "I", "invalidationDelegateGroup", "Landroidx/compose/runtime/CompositionObserverHolder;", "M7", "Landroidx/compose/runtime/CompositionObserverHolder;", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/ComposerImpl;", "p5", "Landroidx/compose/runtime/ComposerImpl;", "composer", "eF", "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", "E", "isRoot", "M", "disposed", "FX", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "composable", "areChildrenComposing", "()Lkotlin/coroutines/CoroutineContext;", "Ik", "isComposing", "isDisposed", "XQ", "hasInvalidations", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 7 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 16 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 17 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 18 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 19 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1354:1\n1110#1,2:1407\n1294#1,3:1409\n1100#1,6:1414\n1298#1,4:1421\n1112#1,4:1425\n1100#1,6:1431\n1110#1,2:1934\n1294#1,3:1936\n1100#1,6:1939\n1298#1,4:1946\n1112#1,4:1950\n1110#1,2:1969\n1294#1,3:1971\n1298#1,4:1975\n1112#1,4:1979\n1110#1,2:2075\n1294#1,3:2077\n1298#1,4:2081\n1112#1,4:2085\n1110#1,2:2091\n1294#1,3:2093\n1298#1,4:2097\n1112#1,4:2101\n1110#1,2:2107\n1294#1,3:2109\n1298#1,4:2113\n1112#1,4:2117\n1294#1,3:2121\n1298#1,4:2125\n27#2:1355\n33#2,2:1357\n33#2,2:1394\n33#2,2:1396\n33#2,2:1412\n33#2,2:1429\n33#2,2:1437\n33#2,2:1452\n33#2,2:1454\n33#2,2:1895\n33#2,2:1932\n33#2,2:2073\n33#2,2:2089\n33#2,2:2105\n33#2,2:2129\n33#2,2:2133\n33#2,2:2135\n33#2,2:2137\n33#2,2:2202\n1#3:1356\n1#3:1420\n1#3:1448\n1#3:1945\n1#3:1974\n1#3:1987\n1#3:1998\n1#3:2080\n1#3:2096\n1#3:2112\n1#3:2124\n1#3:2189\n1#3:2211\n48#4,5:1359\n48#4,5:1364\n48#4,5:1369\n48#4,5:1374\n48#4,5:1379\n48#4,5:1384\n48#4,5:1389\n48#4,5:1439\n48#4,5:2196\n90#5,2:1398\n33#5,6:1400\n92#5:1406\n105#5,2:1954\n33#5,6:1956\n107#5:1962\n33#5,4:2192\n38#5:2201\n174#6,4:1444\n179#6,3:1449\n174#6,4:1983\n179#6,3:1988\n174#6,4:1994\n179#6,3:1999\n174#6,4:2207\n179#6,3:2212\n41#7,3:1456\n46#7:1484\n48#7:1487\n41#7,3:1523\n46#7:1585\n48#7:1613\n231#8,3:1459\n200#8,7:1462\n211#8,3:1470\n214#8,9:1474\n234#8:1483\n231#8,3:1494\n200#8,7:1497\n211#8,3:1505\n214#8,9:1509\n234#8:1518\n231#8,3:1526\n200#8,7:1529\n211#8,3:1537\n214#8,2:1541\n231#8,3:1549\n200#8,7:1552\n211#8,3:1560\n214#8,9:1564\n234#8:1573\n217#8,6:1578\n234#8:1584\n231#8,3:1587\n200#8,7:1590\n211#8,3:1598\n214#8,9:1602\n234#8:1611\n200#8,7:1636\n211#8,3:1644\n214#8,2:1648\n217#8,6:1654\n200#8,7:1700\n211#8,3:1708\n214#8,2:1712\n217#8,6:1718\n200#8,16:1764\n217#8,6:1784\n200#8,7:1810\n211#8,3:1818\n214#8,2:1822\n217#8,6:1828\n231#8,3:1866\n200#8,7:1869\n211#8,3:1877\n214#8,9:1881\n234#8:1890\n231#8,3:1903\n200#8,7:1906\n211#8,3:1914\n214#8,9:1918\n234#8:1927\n200#8,16:2028\n217#8,6:2048\n231#8,3:2146\n200#8,7:2149\n211#8,3:2157\n214#8,9:2161\n234#8:2170\n1399#9:1469\n1270#9:1473\n1399#9:1504\n1270#9:1508\n1399#9:1536\n1270#9:1540\n1399#9:1559\n1270#9:1563\n1399#9:1597\n1270#9:1601\n1399#9:1622\n1270#9:1626\n1399#9:1643\n1270#9:1647\n1399#9:1686\n1270#9:1690\n1399#9:1707\n1270#9:1711\n1399#9:1750\n1270#9:1754\n1399#9:1817\n1270#9:1821\n1399#9:1845\n1270#9:1849\n1399#9:1876\n1270#9:1880\n1399#9:1913\n1270#9:1917\n1399#9:2014\n1270#9:2018\n1399#9:2156\n1270#9:2160\n1855#10,2:1485\n1855#10:1586\n1856#10:1612\n67#11,6:1488\n75#11,4:1519\n67#11,6:1543\n75#11,4:1574\n123#11:1614\n124#11,4:1630\n128#11,6:1661\n135#11:1677\n123#11:1678\n124#11,4:1694\n128#11,6:1725\n135#11:1741\n123#11:1742\n124#11,4:1758\n128#11,6:1791\n135#11:1807\n67#11,6:1860\n75#11,4:1891\n67#11,6:1897\n75#11,4:1928\n123#11:2006\n124#11,4:2022\n128#11,6:2055\n135#11:2071\n81#11:2139\n67#11,6:2140\n75#11,8:2171\n842#12:1615\n844#12:1629\n845#12,3:1667\n848#12:1676\n842#12:1679\n844#12:1693\n845#12,3:1731\n848#12:1740\n842#12:1743\n844#12:1757\n845#12,3:1797\n848#12:1806\n842#12:2007\n844#12:2021\n845#12,3:2061\n848#12:2070\n329#13,6:1616\n339#13,3:1623\n342#13,2:1627\n345#13,6:1670\n329#13,6:1680\n339#13,3:1687\n342#13,2:1691\n345#13,6:1734\n329#13,6:1744\n339#13,3:1751\n342#13,2:1755\n345#13,6:1800\n329#13,6:2008\n339#13,3:2015\n342#13,2:2019\n345#13,6:2064\n809#14,2:1634\n812#14,4:1650\n816#14:1660\n809#14,2:1698\n812#14,4:1714\n816#14:1724\n809#14,2:1762\n812#14,4:1780\n816#14:1790\n809#14,2:1808\n812#14,4:1824\n816#14:1834\n809#14,2:2026\n812#14,4:2044\n816#14:2054\n54#15:1835\n54#15:1852\n403#16,3:1836\n367#16,6:1839\n377#16,3:1846\n380#16,2:1850\n383#16,6:1853\n406#16:1859\n4665#17:1963\n4643#17,5:1964\n45#18,3:1991\n49#18:2002\n45#18,3:2003\n49#18:2072\n45#18,3:2204\n49#18:2215\n13309#19,2:2131\n11383#19,9:2179\n13309#19:2188\n13310#19:2190\n11392#19:2191\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n780#1:1407,2\n780#1:1409,3\n783#1:1414,6\n780#1:1421,4\n780#1:1425,4\n802#1:1431,6\n994#1:1934,2\n994#1:1936,3\n995#1:1939,6\n994#1:1946,4\n994#1:1950,4\n1015#1:1969,2\n1015#1:1971,3\n1015#1:1975,4\n1015#1:1979,4\n1066#1:2075,2\n1066#1:2077,3\n1066#1:2081,4\n1066#1:2085,4\n1075#1:2091,2\n1075#1:2093,3\n1075#1:2097,4\n1075#1:2101,4\n1085#1:2107,2\n1085#1:2109,3\n1085#1:2113,4\n1085#1:2117,4\n1111#1:2121,3\n1111#1:2125,4\n452#1:1355\n610#1:1357,2\n682#1:1394,2\n699#1:1396,2\n781#1:1412,2\n800#1:1429,2\n809#1:1437,2\n854#1:1452,2\n877#1:1454,2\n983#1:1895,2\n992#1:1932,2\n1065#1:2073,2\n1074#1:2089,2\n1084#1:2105,2\n1128#1:2129,2\n1132#1:2133,2\n1175#1:2135,2\n1203#1:2137,2\n1320#1:2202,2\n780#1:1420\n840#1:1448\n994#1:1945\n1015#1:1974\n1021#1:1987\n1035#1:1998\n1066#1:2080\n1075#1:2096\n1085#1:2112\n1111#1:2124\n1281#1:2189\n1327#1:2211\n613#1:1359,5\n620#1:1364,5\n631#1:1369,5\n632#1:1374,5\n651#1:1379,5\n652#1:1384,5\n675#1:1389,5\n810#1:1439,5\n1284#1:2196,5\n706#1:1398,2\n706#1:1400,6\n706#1:1406\n1014#1:1954,2\n1014#1:1956,6\n1014#1:1962\n1282#1:2192,4\n1282#1:2201\n840#1:1444,4\n840#1:1449,3\n1021#1:1983,4\n1021#1:1988,3\n1035#1:1994,4\n1035#1:1999,3\n1327#1:2207,4\n1327#1:2212,3\n885#1:1456,3\n885#1:1484\n885#1:1487\n909#1:1523,3\n909#1:1585\n909#1:1613\n885#1:1459,3\n885#1:1462,7\n885#1:1470,3\n885#1:1474,9\n885#1:1483\n894#1:1494,3\n894#1:1497,7\n894#1:1505,3\n894#1:1509,9\n894#1:1518\n909#1:1526,3\n909#1:1529,7\n909#1:1537,3\n909#1:1541,2\n914#1:1549,3\n914#1:1552,7\n914#1:1560,3\n914#1:1564,9\n914#1:1573\n909#1:1578,6\n909#1:1584\n914#1:1587,3\n914#1:1590,7\n914#1:1598,3\n914#1:1602,9\n914#1:1611\n923#1:1636,7\n923#1:1644,3\n923#1:1648,2\n923#1:1654,6\n929#1:1700,7\n929#1:1708,3\n929#1:1712,2\n929#1:1718,6\n936#1:1764,16\n936#1:1784,6\n938#1:1810,7\n938#1:1818,3\n938#1:1822,2\n938#1:1828,6\n974#1:1866,3\n974#1:1869,7\n974#1:1877,3\n974#1:1881,9\n974#1:1890\n988#1:1903,3\n988#1:1906,7\n988#1:1914,3\n988#1:1918,9\n988#1:1927\n1050#1:2028,16\n1050#1:2048,6\n1239#1:2146,3\n1239#1:2149,7\n1239#1:2157,3\n1239#1:2161,9\n1239#1:2170\n885#1:1469\n885#1:1473\n894#1:1504\n894#1:1508\n909#1:1536\n909#1:1540\n914#1:1559\n914#1:1563\n914#1:1597\n914#1:1601\n923#1:1622\n923#1:1626\n923#1:1643\n923#1:1647\n929#1:1686\n929#1:1690\n929#1:1707\n929#1:1711\n936#1:1750\n936#1:1754\n938#1:1817\n938#1:1821\n959#1:1845\n959#1:1849\n974#1:1876\n974#1:1880\n988#1:1913\n988#1:1917\n1050#1:2014\n1050#1:2018\n1239#1:2156\n1239#1:2160\n885#1:1485,2\n909#1:1586\n909#1:1612\n894#1:1488,6\n894#1:1519,4\n914#1:1543,6\n914#1:1574,4\n923#1:1614\n923#1:1630,4\n923#1:1661,6\n923#1:1677\n929#1:1678\n929#1:1694,4\n929#1:1725,6\n929#1:1741\n936#1:1742\n936#1:1758,4\n936#1:1791,6\n936#1:1807\n974#1:1860,6\n974#1:1891,4\n988#1:1897,6\n988#1:1928,4\n1050#1:2006\n1050#1:2022,4\n1050#1:2055,6\n1050#1:2071\n1239#1:2139\n1239#1:2140,6\n1239#1:2171,8\n923#1:1615\n923#1:1629\n923#1:1667,3\n923#1:1676\n929#1:1679\n929#1:1693\n929#1:1731,3\n929#1:1740\n936#1:1743\n936#1:1757\n936#1:1797,3\n936#1:1806\n1050#1:2007\n1050#1:2021\n1050#1:2061,3\n1050#1:2070\n923#1:1616,6\n923#1:1623,3\n923#1:1627,2\n923#1:1670,6\n929#1:1680,6\n929#1:1687,3\n929#1:1691,2\n929#1:1734,6\n936#1:1744,6\n936#1:1751,3\n936#1:1755,2\n936#1:1800,6\n1050#1:2008,6\n1050#1:2015,3\n1050#1:2019,2\n1050#1:2064,6\n923#1:1634,2\n923#1:1650,4\n923#1:1660\n929#1:1698,2\n929#1:1714,4\n929#1:1724\n936#1:1762,2\n936#1:1780,4\n936#1:1790\n938#1:1808,2\n938#1:1824,4\n938#1:1834\n1050#1:2026,2\n1050#1:2044,4\n1050#1:2054\n950#1:1835\n961#1:1852\n959#1:1836,3\n959#1:1839,6\n959#1:1846,3\n959#1:1850,2\n959#1:1853,6\n959#1:1859\n1014#1:1963\n1014#1:1964,5\n1029#1:1991,3\n1029#1:2002\n1048#1:2003,3\n1048#1:2072\n1323#1:2204,3\n1323#1:2215\n1128#1:2131,2\n1281#1:2179,9\n1281#1:2188\n1281#1:2190\n1281#1:2191\n*E\n"})
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final boolean isRoot;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final MutableScatterMap derivedStates;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private Function2 composable;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final CompositionObserverHolder observerHolder;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private MutableScatterMap invalidations;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference pendingModifications;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private int invalidationDelegateGroup;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterSet invalidatedScopes;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap observationsProcessed;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private CompositionImpl invalidationDelegate;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final ChangeList lateChanges;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private ShouldPauseCallback shouldPause;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap observations;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ChangeList changes;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final CoroutineContext _recomposeContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterSet conditionallyInvalidatedScopes;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private PausedCompositionImpl pendingPausedComposition;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CompositionContext parent;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final SlotTable slotTable;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final ComposerImpl composer;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Set abandonSet;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Applier applier;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean pendingInvalidScopes;

    public CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference(null);
        this.lock = new Object();
        Set setAz = new MutableScatterSet(0, 1, null).az();
        this.abandonSet = setAz;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.nr()) {
            slotTable.qie();
        }
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable.az();
        }
        this.slotTable = slotTable;
        this.observations = ScopeMap.O(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet(0, 1, null);
        this.conditionallyInvalidatedScopes = new MutableScatterSet(0, 1, null);
        this.derivedStates = ScopeMap.O(null, 1, null);
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = ScopeMap.O(null, 1, null);
        this.invalidations = ScopeMap.O(null, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, setAz, changeList, changeList2, this);
        compositionContext.Ik(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.f30068n.n();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void mUb(List references) {
        boolean z2 = true;
        int size = references.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!Intrinsics.areEqual(((MovableContentStateReference) ((Pair) references.get(i2)).getFirst()).getComposition(), this)) {
                z2 = false;
                break;
            }
            i2++;
        }
        if (!z2) {
            ComposerKt.Z("Check failed");
        }
        try {
            this.composer.tUK(references);
            Unit unit = Unit.INSTANCE;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void rl(RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
    }

    private final void E2() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.f30129n)) {
            return;
        }
        if (andSet instanceof Set) {
            nY((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                nY(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.XQ("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.XQ("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final void ViF(Object value, boolean forgetConditionalScopes) {
        Object objO = this.observations.O(value);
        if (objO == null) {
            return;
        }
        if (!(objO instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objO;
            if (ScopeMap.mUb(this.observationsProcessed, value, recomposeScopeImpl) || recomposeScopeImpl.S(value) == InvalidationResult.f30189n) {
                return;
            }
            if (!recomposeScopeImpl.WPU() || forgetConditionalScopes) {
                this.invalidatedScopes.xMQ(recomposeScopeImpl);
                return;
            } else {
                this.conditionallyInvalidatedScopes.xMQ(recomposeScopeImpl);
                return;
            }
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) objO;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i2 << 3) + i5];
                        if (!ScopeMap.mUb(this.observationsProcessed, value, recomposeScopeImpl2) && recomposeScopeImpl2.S(value) != InvalidationResult.f30189n) {
                            if (!recomposeScopeImpl2.WPU() || forgetConditionalScopes) {
                                this.invalidatedScopes.xMQ(recomposeScopeImpl2);
                            } else {
                                this.conditionallyInvalidatedScopes.xMQ(recomposeScopeImpl2);
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final boolean X() {
        return this.composer.GD();
    }

    private final MutableScatterMap Xw() {
        MutableScatterMap mutableScatterMap = this.invalidations;
        this.invalidations = ScopeMap.O(null, 1, null);
        return mutableScatterMap;
    }

    private final void e() {
        Object andSet = this.pendingModifications.getAndSet(SetsKt.emptySet());
        if (Intrinsics.areEqual(andSet, CompositionKt.f30129n) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            nY((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ComposerKt.XQ("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set set : (Set[]) andSet) {
            nY(set, false);
        }
    }

    private final void fD() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.f30129n);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, CompositionKt.f30129n)) {
                ComposerKt.XQ("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                nY((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.XQ("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                nY(set, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void g(ChangeList changes) throws Throwable {
        RememberEventDispatcher rememberEventDispatcher;
        Applier applierN;
        RememberManager rememberManagerRl;
        RememberEventDispatcher rememberEventDispatcher2;
        boolean z2;
        int i2;
        RememberEventDispatcher rememberEventDispatcher3;
        long j2;
        char c2;
        long j3;
        int i3;
        boolean zO;
        int i5;
        CompositionImpl compositionImpl = this;
        boolean z3 = true;
        RememberEventDispatcher rememberEventDispatcher4 = new RememberEventDispatcher(compositionImpl.abandonSet);
        try {
            if (changes.O()) {
                if (compositionImpl.lateChanges.O() && compositionImpl.pendingPausedComposition == null) {
                    rememberEventDispatcher4.xMQ();
                    return;
                }
                return;
            }
            Trace trace = Trace.f30884n;
            Object objN = trace.n("Compose:applyChanges");
            try {
                PausedCompositionImpl pausedCompositionImpl = compositionImpl.pendingPausedComposition;
                if (pausedCompositionImpl == null || (applierN = pausedCompositionImpl.getPausableApplier()) == null) {
                    applierN = compositionImpl.applier;
                }
                PausedCompositionImpl pausedCompositionImpl2 = compositionImpl.pendingPausedComposition;
                if (pausedCompositionImpl2 == null || (rememberManagerRl = pausedCompositionImpl2.getRememberManager()) == null) {
                    rememberManagerRl = rememberEventDispatcher4;
                }
                applierN.mUb();
                SlotWriter slotWriterG = compositionImpl.slotTable.g();
                int i7 = 0;
                try {
                    changes.t(applierN, slotWriterG, rememberManagerRl);
                    Unit unit = Unit.INSTANCE;
                    slotWriterG.wTp(true);
                    applierN.J2();
                    trace.rl(objN);
                    rememberEventDispatcher4.gh();
                    rememberEventDispatcher4.qie();
                    if (compositionImpl.pendingInvalidScopes) {
                        try {
                            try {
                                Object objN2 = trace.n("Compose:unobserve");
                                try {
                                    compositionImpl.pendingInvalidScopes = false;
                                    MutableScatterMap mutableScatterMap = compositionImpl.observations;
                                    long[] jArr = mutableScatterMap.metadata;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i8 = 0;
                                        while (true) {
                                            long j4 = jArr[i8];
                                            char c4 = 7;
                                            long j5 = -9187201950435737472L;
                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i9 = 8;
                                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                                z2 = z3;
                                                int i11 = i7;
                                                while (i11 < i10) {
                                                    if ((j4 & 255) < 128) {
                                                        c2 = c4;
                                                        int i12 = (i8 << 3) + i11;
                                                        j3 = j5;
                                                        Object obj = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i12];
                                                        Object obj2 = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i12];
                                                        if (obj2 instanceof MutableScatterSet) {
                                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                                            Object[] objArr = mutableScatterSet.elements;
                                                            long[] jArr2 = mutableScatterSet.metadata;
                                                            int i13 = i9;
                                                            int length2 = jArr2.length - 2;
                                                            i2 = i11;
                                                            if (length2 >= 0) {
                                                                j2 = j4;
                                                                int i14 = 0;
                                                                while (true) {
                                                                    long j6 = jArr2[i14];
                                                                    rememberEventDispatcher3 = rememberEventDispatcher4;
                                                                    if ((((~j6) << c2) & j6 & j3) != j3) {
                                                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                                        int i16 = 0;
                                                                        while (i16 < i15) {
                                                                            if ((j6 & 255) < 128) {
                                                                                i5 = i16;
                                                                                int i17 = (i14 << 3) + i5;
                                                                                try {
                                                                                    if (!((RecomposeScopeImpl) objArr[i17]).XQ()) {
                                                                                        mutableScatterSet.te(i17);
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    Trace.f30884n.rl(objN2);
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                i5 = i16;
                                                                            }
                                                                            j6 >>= i13;
                                                                            i16 = i5 + 1;
                                                                        }
                                                                        if (i15 != i13) {
                                                                            break;
                                                                        }
                                                                        if (i14 == length2) {
                                                                            break;
                                                                        }
                                                                        i14++;
                                                                        rememberEventDispatcher4 = rememberEventDispatcher3;
                                                                        i13 = 8;
                                                                    }
                                                                }
                                                            } else {
                                                                rememberEventDispatcher3 = rememberEventDispatcher4;
                                                                j2 = j4;
                                                            }
                                                            zO = mutableScatterSet.O();
                                                        } else {
                                                            i2 = i11;
                                                            rememberEventDispatcher3 = rememberEventDispatcher4;
                                                            j2 = j4;
                                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                            zO = !((RecomposeScopeImpl) obj2).XQ() ? z2 : false;
                                                        }
                                                        if (zO) {
                                                            mutableScatterMap.S(i12);
                                                        }
                                                        i3 = 8;
                                                    } else {
                                                        i2 = i11;
                                                        rememberEventDispatcher3 = rememberEventDispatcher4;
                                                        j2 = j4;
                                                        c2 = c4;
                                                        j3 = j5;
                                                        i3 = i9;
                                                    }
                                                    j4 = j2 >> i3;
                                                    i11 = i2 + 1;
                                                    c4 = c2;
                                                    i9 = i3;
                                                    j5 = j3;
                                                    rememberEventDispatcher4 = rememberEventDispatcher3;
                                                }
                                                rememberEventDispatcher2 = rememberEventDispatcher4;
                                                if (i10 != i9) {
                                                    break;
                                                }
                                            } else {
                                                z2 = z3;
                                                rememberEventDispatcher2 = rememberEventDispatcher4;
                                            }
                                            if (i8 == length) {
                                                break;
                                            }
                                            i8++;
                                            z3 = z2;
                                            rememberEventDispatcher4 = rememberEventDispatcher2;
                                            i7 = 0;
                                        }
                                    } else {
                                        rememberEventDispatcher2 = rememberEventDispatcher4;
                                    }
                                    te();
                                    Unit unit2 = Unit.INSTANCE;
                                    Trace.f30884n.rl(objN2);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                rememberEventDispatcher = rememberEventDispatcher4;
                                compositionImpl = this;
                                if (compositionImpl.lateChanges.O()) {
                                    rememberEventDispatcher.xMQ();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            compositionImpl = this;
                            if (compositionImpl.lateChanges.O()) {
                            }
                            throw th;
                        }
                    } else {
                        rememberEventDispatcher2 = rememberEventDispatcher4;
                    }
                    if (this.lateChanges.O() && this.pendingPausedComposition == null) {
                        rememberEventDispatcher2.xMQ();
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    rememberEventDispatcher = rememberEventDispatcher4;
                    try {
                        slotWriterG.wTp(false);
                        throw th5;
                    } catch (Throwable th6) {
                        th = th6;
                        try {
                            Trace.f30884n.rl(objN);
                            throw th;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                rememberEventDispatcher = rememberEventDispatcher4;
            }
        } catch (Throwable th9) {
            th = th9;
            rememberEventDispatcher = rememberEventDispatcher4;
        }
        if (compositionImpl.lateChanges.O() && compositionImpl.pendingPausedComposition == null) {
            rememberEventDispatcher.xMQ();
        }
        throw th;
    }

    private final void iF(Function2 content) {
        if (this.disposed) {
            PreconditionsKt.rl("The composition is disposed");
        }
        this.composable = content;
        this.parent.n(this, content);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176 A[EDGE_INSN: B:70:0x0176->B:219:0x0113 BREAK  A[LOOP:13: B:60:0x0144->B:71:0x0178]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void nY(Set values, boolean forgetConditionalScopes) {
        char c2;
        long j2;
        long j3;
        long j4;
        int i2;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        long j5;
        boolean zRl;
        long j6;
        long[] jArr3;
        int i3;
        long[] jArr4;
        int i5;
        int i7;
        long j7;
        boolean zO;
        int i8;
        long j9;
        long j10;
        char c4;
        long j11;
        int i9;
        int i10;
        int i11;
        Object obj = null;
        char c5 = 7;
        long j12 = -9187201950435737472L;
        int i12 = 8;
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set = ((ScatterSetWrapper) values).getSet();
            Object[] objArr = set.elements;
            long[] jArr5 = set.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i13 = 0;
                j3 = 128;
                while (true) {
                    long j13 = jArr5[i13];
                    j4 = 255;
                    if ((((~j13) << c5) & j13 & j12) != j12) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j13 & 255) < 128) {
                                c4 = c5;
                                Object obj2 = objArr[(i13 << 3) + i15];
                                j11 = j12;
                                if (obj2 instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj2).S(obj);
                                } else {
                                    ViF(obj2, forgetConditionalScopes);
                                    Object objO = this.derivedStates.O(obj2);
                                    if (objO != null) {
                                        if (objO instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) objO;
                                            Object[] objArr2 = mutableScatterSet.elements;
                                            long[] jArr6 = mutableScatterSet.metadata;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                j10 = j13;
                                                int i16 = 0;
                                                while (true) {
                                                    long j14 = jArr6[i16];
                                                    int i17 = i12;
                                                    i9 = length;
                                                    if ((((~j14) << c4) & j14 & j11) != j11) {
                                                        int i18 = 8 - ((~(i16 - length2)) >>> 31);
                                                        int i19 = 0;
                                                        while (i19 < i18) {
                                                            if ((j14 & 255) < 128) {
                                                                i11 = i17;
                                                                ViF((DerivedState) objArr2[(i16 << 3) + i19], forgetConditionalScopes);
                                                            } else {
                                                                i11 = i17;
                                                            }
                                                            j14 >>= i11;
                                                            i19++;
                                                            i17 = i11;
                                                        }
                                                        if (i18 != i17) {
                                                            break;
                                                        }
                                                        if (i16 == length2) {
                                                            break;
                                                        }
                                                        i16++;
                                                        length = i9;
                                                        i12 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            j10 = j13;
                                            i9 = length;
                                            ViF((DerivedState) objO, forgetConditionalScopes);
                                        }
                                        i10 = 8;
                                    }
                                }
                                j10 = j13;
                                i9 = length;
                                i10 = 8;
                            } else {
                                j10 = j13;
                                c4 = c5;
                                j11 = j12;
                                i9 = length;
                                i10 = i12;
                            }
                            i15++;
                            length = i9;
                            i12 = i10;
                            c5 = c4;
                            j12 = j11;
                            j13 = j10 >> i10;
                            obj = null;
                        }
                        c2 = c5;
                        j2 = j12;
                        int i20 = length;
                        if (i14 != i12) {
                            break;
                        } else {
                            length = i20;
                        }
                    } else {
                        c2 = c5;
                        j2 = j12;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    c5 = c2;
                    j12 = j2;
                    obj = null;
                    i12 = 8;
                }
            } else {
                c2 = 7;
                j2 = -9187201950435737472L;
                j3 = 128;
                j4 = 255;
            }
        } else {
            c2 = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
            j4 = 255;
            for (Object obj3 : values) {
                if (obj3 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj3).S(null);
                } else {
                    ViF(obj3, forgetConditionalScopes);
                    Object objO2 = this.derivedStates.O(obj3);
                    if (objO2 != null) {
                        if (objO2 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) objO2;
                            Object[] objArr3 = mutableScatterSet2.elements;
                            long[] jArr7 = mutableScatterSet2.metadata;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j15 = jArr7[i2];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i2 - length3)) >>> 31);
                                        for (int i22 = 0; i22 < i21; i22++) {
                                            if ((j15 & 255) < 128) {
                                                ViF((DerivedState) objArr3[(i2 << 3) + i22], forgetConditionalScopes);
                                            }
                                            j15 >>= 8;
                                        }
                                        if (i21 == 8) {
                                            i2 = i2 != length3 ? i2 + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            ViF((DerivedState) objO2, forgetConditionalScopes);
                        }
                    }
                }
            }
        }
        MutableScatterSet mutableScatterSet3 = this.conditionallyInvalidatedScopes;
        MutableScatterSet mutableScatterSet4 = this.invalidatedScopes;
        String str3 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (!forgetConditionalScopes || !mutableScatterSet3.J2()) {
            if (mutableScatterSet4.J2()) {
                MutableScatterMap mutableScatterMap = this.observations;
                long[] jArr8 = mutableScatterMap.metadata;
                int length4 = jArr8.length - 2;
                if (length4 >= 0) {
                    int i23 = 0;
                    while (true) {
                        long j16 = jArr8[i23];
                        if ((((~j16) << c2) & j16 & j2) != j2) {
                            int i24 = 8 - ((~(i23 - length4)) >>> 31);
                            int i25 = 0;
                            while (i25 < i24) {
                                if ((j16 & j4) < j3) {
                                    int i26 = (i23 << 3) + i25;
                                    Object obj4 = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i26];
                                    Object obj5 = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i26];
                                    if (obj5 instanceof MutableScatterSet) {
                                        Intrinsics.checkNotNull(obj5, str3);
                                        MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj5;
                                        Object[] objArr4 = mutableScatterSet5.elements;
                                        long[] jArr9 = mutableScatterSet5.metadata;
                                        int length5 = jArr9.length - 2;
                                        jArr2 = jArr8;
                                        str2 = str3;
                                        if (length5 >= 0) {
                                            int i27 = 0;
                                            while (true) {
                                                long j17 = jArr9[i27];
                                                j5 = j16;
                                                if ((((~j17) << c2) & j17 & j2) != j2) {
                                                    int i28 = 8 - ((~(i27 - length5)) >>> 31);
                                                    int i29 = 0;
                                                    while (i29 < i28) {
                                                        if ((j17 & j4) < j3) {
                                                            j6 = j17;
                                                            int i30 = (i27 << 3) + i29;
                                                            if (mutableScatterSet4.rl((RecomposeScopeImpl) objArr4[i30])) {
                                                                mutableScatterSet5.te(i30);
                                                            }
                                                        } else {
                                                            j6 = j17;
                                                        }
                                                        i29++;
                                                        j17 = j6 >> 8;
                                                    }
                                                    if (i28 != 8) {
                                                        break;
                                                    }
                                                    if (i27 == length5) {
                                                        break;
                                                    }
                                                    i27++;
                                                    j16 = j5;
                                                }
                                            }
                                        } else {
                                            j5 = j16;
                                        }
                                        zRl = mutableScatterSet5.O();
                                    } else {
                                        jArr2 = jArr8;
                                        str2 = str3;
                                        j5 = j16;
                                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        zRl = mutableScatterSet4.rl((RecomposeScopeImpl) obj5);
                                    }
                                    if (zRl) {
                                        mutableScatterMap.S(i26);
                                    }
                                } else {
                                    jArr2 = jArr8;
                                    str2 = str3;
                                    j5 = j16;
                                }
                                j16 = j5 >> 8;
                                i25++;
                                jArr8 = jArr2;
                                str3 = str2;
                            }
                            jArr = jArr8;
                            str = str3;
                            if (i24 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr8;
                            str = str3;
                        }
                        if (i23 == length4) {
                            break;
                        }
                        i23++;
                        jArr8 = jArr;
                        str3 = str;
                    }
                }
                te();
                mutableScatterSet4.ty();
                return;
            }
            return;
        }
        MutableScatterMap mutableScatterMap2 = this.observations;
        long[] jArr10 = mutableScatterMap2.metadata;
        int length6 = jArr10.length - 2;
        if (length6 >= 0) {
            int i31 = 0;
            while (true) {
                long j18 = jArr10[i31];
                if ((((~j18) << c2) & j18 & j2) != j2) {
                    int i32 = 8 - ((~(i31 - length6)) >>> 31);
                    int i33 = 0;
                    while (i33 < i32) {
                        if ((j18 & j4) < j3) {
                            int i34 = (i31 << 3) + i33;
                            Object obj6 = mutableScatterMap2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i34];
                            Object obj7 = mutableScatterMap2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i34];
                            if (obj7 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj7;
                                Object[] objArr5 = mutableScatterSet6.elements;
                                long[] jArr11 = mutableScatterSet6.metadata;
                                jArr4 = jArr10;
                                int length7 = jArr11.length - 2;
                                if (length7 >= 0) {
                                    j7 = j18;
                                    int i35 = 0;
                                    while (true) {
                                        long j19 = jArr11[i35];
                                        i5 = length6;
                                        i7 = i31;
                                        if ((((~j19) << c2) & j19 & j2) != j2) {
                                            int i36 = 8 - ((~(i35 - length7)) >>> 31);
                                            for (int i37 = 0; i37 < i36; i37 = i8 + 1) {
                                                if ((j19 & j4) < j3) {
                                                    i8 = i37;
                                                    int i38 = (i35 << 3) + i8;
                                                    j9 = j19;
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr5[i38];
                                                    if (mutableScatterSet3.rl(recomposeScopeImpl) || mutableScatterSet4.rl(recomposeScopeImpl)) {
                                                        mutableScatterSet6.te(i38);
                                                    }
                                                } else {
                                                    i8 = i37;
                                                    j9 = j19;
                                                }
                                                j19 = j9 >> 8;
                                            }
                                            if (i36 != 8) {
                                                break;
                                            }
                                            if (i35 == length7) {
                                                break;
                                            }
                                            i35++;
                                            length6 = i5;
                                            i31 = i7;
                                        }
                                    }
                                } else {
                                    i5 = length6;
                                    i7 = i31;
                                    j7 = j18;
                                }
                                zO = mutableScatterSet6.O();
                            } else {
                                jArr4 = jArr10;
                                i5 = length6;
                                i7 = i31;
                                j7 = j18;
                                Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj7;
                                zO = mutableScatterSet3.rl(recomposeScopeImpl2) || mutableScatterSet4.rl(recomposeScopeImpl2);
                            }
                            if (zO) {
                                mutableScatterMap2.S(i34);
                            }
                        } else {
                            jArr4 = jArr10;
                            i5 = length6;
                            i7 = i31;
                            j7 = j18;
                        }
                        j18 = j7 >> 8;
                        i33++;
                        length6 = i5;
                        jArr10 = jArr4;
                        i31 = i7;
                    }
                    jArr3 = jArr10;
                    int i39 = length6;
                    int i40 = i31;
                    if (i32 != 8) {
                        break;
                    }
                    length6 = i39;
                    i3 = i40;
                } else {
                    jArr3 = jArr10;
                    i3 = i31;
                }
                if (i3 == length6) {
                    break;
                }
                i31 = i3 + 1;
                jArr10 = jArr3;
            }
        }
        mutableScatterSet3.ty();
        te();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac A[Catch: all -> 0x001e, EDGE_INSN: B:66:0x00ac->B:51:0x00ac BREAK  A[LOOP:0: B:33:0x0063->B:47:0x00a4], EDGE_INSN: B:67:0x00ac->B:51:0x00ac BREAK  A[LOOP:0: B:33:0x0063->B:47:0x00a4], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0033, B:23:0x003e, B:25:0x0042, B:26:0x004b, B:28:0x0053, B:30:0x0057, B:33:0x0063, B:35:0x0073, B:37:0x007f, B:39:0x0089, B:43:0x0098, B:47:0x00a4, B:48:0x00a7, B:51:0x00ac), top: B:64:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InvalidationResult s7N(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        int i2;
        synchronized (this.lock) {
            try {
                CompositionImpl compositionImpl = this.invalidationDelegate;
                CompositionImpl compositionImpl2 = null;
                if (compositionImpl != null) {
                    if (!this.slotTable.ViF(this.invalidationDelegateGroup, anchor)) {
                        compositionImpl = null;
                    }
                    compositionImpl2 = compositionImpl;
                }
                if (compositionImpl2 == null) {
                    if (jB(scope, instance)) {
                        return InvalidationResult.J2;
                    }
                    CompositionObserver compositionObserverV = v();
                    if (instance == null) {
                        ScopeMap.qie(this.invalidations, scope, ScopeInvalidated.f30372n);
                    } else if (compositionObserverV != null || (instance instanceof DerivedState)) {
                        Object objO = this.invalidations.O(scope);
                        if (objO == null) {
                            ScopeMap.n(this.invalidations, scope, instance);
                        } else if (objO instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) objO;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr = mutableScatterSet.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                loop0: while (true) {
                                    long j2 = jArr[i3];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8;
                                        int i7 = 8 - ((~(i3 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j2 & 255) < 128) {
                                                i2 = i5;
                                                if (objArr[(i3 << 3) + i8] == ScopeInvalidated.f30372n) {
                                                    break loop0;
                                                }
                                            } else {
                                                i2 = i5;
                                            }
                                            j2 >>= i2;
                                            i8++;
                                            i5 = i2;
                                        }
                                        if (i7 != i5) {
                                            break;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                ScopeMap.n(this.invalidations, scope, instance);
                            }
                        } else if (objO == ScopeInvalidated.f30372n) {
                        }
                    } else {
                        ScopeMap.qie(this.invalidations, scope, ScopeInvalidated.f30372n);
                    }
                }
                if (compositionImpl2 != null) {
                    return compositionImpl2.s7N(scope, anchor, instance);
                }
                this.parent.az(this);
                return Ik() ? InvalidationResult.f30188O : InvalidationResult.f30192t;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void te() {
        char c2;
        long j2;
        long j3;
        long j4;
        long[] jArr;
        long[] jArr2;
        long j5;
        int i2;
        char c4;
        long j6;
        long j7;
        int i3;
        boolean zO;
        long[] jArr3;
        int i5;
        int i7;
        MutableScatterMap mutableScatterMap = this.derivedStates;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        char c5 = 7;
        long j9 = -9187201950435737472L;
        int i8 = 8;
        if (length >= 0) {
            int i9 = 0;
            long j10 = 128;
            while (true) {
                long j11 = jArr4[i9];
                j3 = 255;
                if ((((~j11) << c5) & j11 & j9) != j9) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j11 & 255) < j10) {
                            c4 = c5;
                            int i12 = (i9 << 3) + i11;
                            j6 = j9;
                            Object obj = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i12];
                            Object obj2 = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i12];
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr5 = mutableScatterSet.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j7 = j10;
                                    int i13 = 0;
                                    int i14 = i8;
                                    while (true) {
                                        int i15 = length2;
                                        long j12 = jArr5[i13];
                                        j5 = j11;
                                        if ((((~j12) << c4) & j12 & j6) != j6) {
                                            int i16 = 8 - ((~(i13 - i15)) >>> 31);
                                            int i17 = 0;
                                            while (i17 < i16) {
                                                if ((j12 & 255) < j7) {
                                                    jArr3 = jArr4;
                                                    int i18 = (i13 << 3) + i17;
                                                    i5 = i17;
                                                    i7 = i11;
                                                    if (!ScopeMap.J2(this.observations, (DerivedState) objArr[i18])) {
                                                        mutableScatterSet.te(i18);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i5 = i17;
                                                    i7 = i11;
                                                }
                                                j12 >>= i14;
                                                i17 = i5 + 1;
                                                i11 = i7;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i2 = i11;
                                            if (i16 != i14) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i2 = i11;
                                        }
                                        length2 = i15;
                                        if (i13 == length2) {
                                            break;
                                        }
                                        i13++;
                                        j11 = j5;
                                        i11 = i2;
                                        jArr4 = jArr2;
                                        i14 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j5 = j11;
                                    i2 = i11;
                                    j7 = j10;
                                }
                                zO = mutableScatterSet.O();
                            } else {
                                jArr2 = jArr4;
                                j5 = j11;
                                i2 = i11;
                                j7 = j10;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zO = !ScopeMap.J2(this.observations, (DerivedState) obj2);
                            }
                            if (zO) {
                                mutableScatterMap.S(i12);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr4;
                            j5 = j11;
                            i2 = i11;
                            c4 = c5;
                            j6 = j9;
                            j7 = j10;
                            i3 = i8;
                        }
                        j11 = j5 >> i3;
                        i11 = i2 + 1;
                        i8 = i3;
                        c5 = c4;
                        j9 = j6;
                        j10 = j7;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c2 = c5;
                    j2 = j9;
                    j4 = j10;
                    if (i10 != i8) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c2 = c5;
                    j2 = j9;
                    j4 = j10;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                c5 = c2;
                j9 = j2;
                j10 = j4;
                jArr4 = jArr;
                i8 = 8;
            }
        } else {
            c2 = 7;
            j2 = -9187201950435737472L;
            j3 = 255;
            j4 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.J2()) {
            return;
        }
        MutableScatterSet mutableScatterSet2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = mutableScatterSet2.elements;
        long[] jArr6 = mutableScatterSet2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            long j13 = jArr6[i19];
            if ((((~j13) << c2) & j13 & j2) != j2) {
                int i20 = 8 - ((~(i19 - length3)) >>> 31);
                for (int i21 = 0; i21 < i20; i21++) {
                    if ((j13 & j3) < j4) {
                        int i22 = (i19 << 3) + i21;
                        if (!((RecomposeScopeImpl) objArr2[i22]).WPU()) {
                            mutableScatterSet2.te(i22);
                        }
                    }
                    j13 >>= 8;
                }
                if (i20 != 8) {
                    return;
                }
            }
            if (i19 == length3) {
                return;
            } else {
                i19++;
            }
        }
    }

    private final CompositionObserver v() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder compositionObserverHolderMUb = this.parent.getObserverHolder();
        CompositionObserver observer = compositionObserverHolderMUb != null ? compositionObserverHolderMUb.getObserver() : null;
        if (!Intrinsics.areEqual(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.t(observer);
        }
        return observer;
    }

    private final void wTp(Object value) {
        Object objO = this.observations.O(value);
        if (objO == null) {
            return;
        }
        if (!(objO instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objO;
            if (recomposeScopeImpl.S(value) == InvalidationResult.J2) {
                ScopeMap.n(this.observationsProcessed, value, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) objO;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i2 << 3) + i5];
                        if (recomposeScopeImpl2.S(value) == InvalidationResult.J2) {
                            ScopeMap.n(this.observationsProcessed, value, recomposeScopeImpl2);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.ControlledComposition
    public void HI(Set values) {
        Object obj;
        Object objPlus;
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.f30129n)) {
                objPlus = values;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objPlus = ArraysKt.plus((Set[]) obj, values);
            }
        } while (!fuX.n(this.pendingModifications, obj, objPlus));
        if (obj == null) {
            synchronized (this.lock) {
                E2();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean Ik() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: J2, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // androidx.compose.runtime.Composition
    public void KN(Function2 content) {
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.rl("A pausable composition is in progress");
        }
        iF(content);
    }

    public final CoroutineContext N() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.gh() : coroutineContext;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void O() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.J2()) {
                    g(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).xMQ();
                        }
                        throw th;
                    } catch (Exception e2) {
                        S();
                        throw e2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void S() {
        this.pendingModifications.set(null);
        this.changes.rl();
        this.lateChanges.rl();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new RememberEventDispatcher(this.abandonSet).xMQ();
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    public final void U() {
        synchronized (this.lock) {
            e();
            MutableScatterMap mutableScatterMapXw = Xw();
            try {
                this.composer.Lp6(mutableScatterMapXw);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e2) {
                this.invalidations = mutableScatterMapXw;
                throw e2;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void WPU() {
        synchronized (this.lock) {
            try {
                this.composer.z();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).xMQ();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).xMQ();
                        }
                        throw th;
                    } catch (Exception e2) {
                        S();
                        throw e2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public boolean XQ() {
        boolean z2;
        synchronized (this.lock) {
            z2 = ScopeMap.KN(this.invalidations) > 0;
        }
        return z2;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void aYN() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean az(Set values) {
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set = ((ScatterSetWrapper) values).getSet();
            Object[] objArr = set.elements;
            long[] jArr = set.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                loop0: while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                Object obj = objArr[(i2 << 3) + i5];
                                if (ScopeMap.J2(this.observations, obj) || ScopeMap.J2(this.derivedStates, obj)) {
                                    break loop0;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        } else {
            for (Object obj2 : values) {
                if (ScopeMap.J2(this.observations, obj2) || ScopeMap.J2(this.derivedStates, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void bzg(Object instance, RecomposeScopeImpl scope) {
        ScopeMap.mUb(this.observations, instance, scope);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void ck() {
        synchronized (this.lock) {
            try {
                g(this.changes);
                E2();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).xMQ();
                        }
                        throw th;
                    } catch (Exception e2) {
                        S();
                        throw e2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            try {
                boolean z2 = this.slotTable.getGroupsSize() > 0;
                if (z2 || !this.abandonSet.isEmpty()) {
                    Trace trace = Trace.f30884n;
                    Object objN = trace.n("Compose:deactivate");
                    try {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z2) {
                            this.applier.mUb();
                            SlotWriter slotWriterG = this.slotTable.g();
                            try {
                                ComposerKt.S(slotWriterG, rememberEventDispatcher);
                                Unit unit = Unit.INSTANCE;
                                slotWriterG.wTp(true);
                                this.applier.J2();
                                rememberEventDispatcher.gh();
                            } catch (Throwable th) {
                                slotWriterG.wTp(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.xMQ();
                        Unit unit2 = Unit.INSTANCE;
                        trace.rl(objN);
                    } catch (Throwable th2) {
                        Trace.f30884n.rl(objN);
                        throw th2;
                    }
                }
                ScopeMap.t(this.observations);
                ScopeMap.t(this.derivedStates);
                ScopeMap.t(this.invalidations);
                this.changes.rl();
                this.lateChanges.rl();
                this.composer.C();
                Unit unit3 = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public Object gh(ControlledComposition to, int groupIndex, Function0 block) {
        if (to == null || Intrinsics.areEqual(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void n() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    PreconditionsKt.rl("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = ComposableSingletons$CompositionKt.f30068n.rl();
                    ChangeList changeListHRu = this.composer.getDeferredChanges();
                    if (changeListHRu != null) {
                        g(changeListHRu);
                    }
                    boolean z2 = this.slotTable.getGroupsSize() > 0;
                    if (z2 || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z2) {
                            this.applier.mUb();
                            SlotWriter slotWriterG = this.slotTable.g();
                            try {
                                ComposerKt.Xw(slotWriterG, rememberEventDispatcher);
                                Unit unit = Unit.INSTANCE;
                                slotWriterG.wTp(true);
                                this.applier.clear();
                                this.applier.J2();
                                rememberEventDispatcher.gh();
                            } catch (Throwable th) {
                                slotWriterG.wTp(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.xMQ();
                    }
                    this.composer.Mx();
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.S(this);
    }

    /* JADX INFO: renamed from: nHg, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void nr(Function2 content) {
        MutableScatterMap mutableScatterMapXw;
        try {
            synchronized (this.lock) {
                try {
                    fD();
                    mutableScatterMapXw = Xw();
                    CompositionObserver compositionObserverV = v();
                    if (compositionObserverV != null) {
                        Map mapRl = ScopeMap.rl(mutableScatterMapXw);
                        Intrinsics.checkNotNull(mapRl, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");
                        compositionObserverV.n(this, mapRl);
                    }
                    this.composer.m(mutableScatterMapXw, content, this.shouldPause);
                    if (compositionObserverV != null) {
                        compositionObserverV.rl(this);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e2) {
                    this.invalidations = mutableScatterMapXw;
                    throw e2;
                } finally {
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(Object value) {
        synchronized (this.lock) {
            try {
                wTp(value);
                Object objO = this.derivedStates.O(value);
                if (objO != null) {
                    if (objO instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet = (MutableScatterSet) objO;
                        Object[] objArr = mutableScatterSet.elements;
                        long[] jArr = mutableScatterSet.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j2 = jArr[i2];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i3; i5++) {
                                        if ((255 & j2) < 128) {
                                            wTp((DerivedState) objArr[(i2 << 3) + i5]);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i3 != 8) {
                                        break;
                                    } else if (i2 == length) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        }
                    } else {
                        wTp((DerivedState) objO);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean qie() {
        boolean zVwL;
        synchronized (this.lock) {
            try {
                fD();
                try {
                    MutableScatterMap mutableScatterMapXw = Xw();
                    try {
                        CompositionObserver compositionObserverV = v();
                        if (compositionObserverV != null) {
                            Map mapRl = ScopeMap.rl(mutableScatterMapXw);
                            Intrinsics.checkNotNull(mapRl, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");
                            compositionObserverV.n(this, mapRl);
                        }
                        zVwL = this.composer.VwL(mutableScatterMapXw, this.shouldPause);
                        if (!zVwL) {
                            E2();
                        }
                        if (compositionObserverV != null) {
                            compositionObserverV.rl(this);
                        }
                    } catch (Exception e2) {
                        this.invalidations = mutableScatterMapXw;
                        throw e2;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVwL;
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void r(Function2 content) {
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.rl("A pausable composition is in progress");
        }
        this.composer.o9();
        iF(content);
        this.composer.n1();
    }

    public final void rV9(DerivedState state) {
        if (ScopeMap.J2(this.observations, state)) {
            return;
        }
        ScopeMap.gh(this.derivedStates, state);
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void t(Object value) {
        RecomposeScopeImpl recomposeScopeImplEWS;
        int i2;
        int i3;
        int i5;
        if (X() || (recomposeScopeImplEWS = this.composer.EWS()) == null) {
            return;
        }
        int i7 = 1;
        recomposeScopeImplEWS.rV9(true);
        if (recomposeScopeImplEWS.nY(value)) {
            return;
        }
        if (value instanceof StateObjectImpl) {
            ((StateObjectImpl) value).iF(ReaderKind.n(1));
        }
        ScopeMap.n(this.observations, value, recomposeScopeImplEWS);
        if (value instanceof DerivedState) {
            DerivedState derivedState = (DerivedState) value;
            DerivedState.Record recordG = derivedState.g();
            ScopeMap.gh(this.derivedStates, value);
            ObjectIntMap objectIntMapRl = recordG.rl();
            Object[] objArr = objectIntMapRl.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
            long[] jArr = objectIntMapRl.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j2 = jArr[i8];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j2 & 255) < 128) {
                                i3 = i7;
                                StateObject stateObject = (StateObject) objArr[(i8 << 3) + i11];
                                if (stateObject instanceof StateObjectImpl) {
                                    i5 = i9;
                                    ((StateObjectImpl) stateObject).iF(ReaderKind.n(i3));
                                } else {
                                    i5 = i9;
                                }
                                ScopeMap.n(this.derivedStates, stateObject, value);
                            } else {
                                i3 = i7;
                                i5 = i9;
                            }
                            j2 >>= i5;
                            i11++;
                            i7 = i3;
                            i9 = i5;
                        }
                        i2 = i7;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        i2 = i7;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    i7 = i2;
                }
            }
            recomposeScopeImplEWS.ViF(derivedState, recordG.n());
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void ty(Function0 block) {
        this.composer.QZ6(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void xMQ(MovableContentState state) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterG = state.getSlotTable().g();
        try {
            ComposerKt.Xw(slotWriterG, rememberEventDispatcher);
            Unit unit = Unit.INSTANCE;
            slotWriterG.wTp(true);
            rememberEventDispatcher.gh();
        } catch (Throwable th) {
            slotWriterG.wTp(false);
            throw th;
        }
    }

    private final boolean jB(RecomposeScopeImpl scope, Object instance) {
        if (Ik() && this.composer.Aum(scope, instance)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult Uo(RecomposeScopeImpl scope, Object instance) {
        CompositionImpl compositionImpl;
        if (scope.gh()) {
            scope.e(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor != null && anchor.rl()) {
            if (!this.slotTable.te(anchor)) {
                synchronized (this.lock) {
                    compositionImpl = this.invalidationDelegate;
                }
                if (compositionImpl != null && compositionImpl.jB(scope, instance)) {
                    return InvalidationResult.J2;
                }
                return InvalidationResult.f30189n;
            }
            if (!scope.mUb()) {
                return InvalidationResult.f30189n;
            }
            return s7N(scope, anchor, instance);
        }
        return InvalidationResult.f30189n;
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i2 & 4) != 0 ? null : coroutineContext);
    }
}
