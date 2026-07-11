package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\u0012\u001a\u00020\n2\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0015\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00172\n\u0010\u0005\u001a\u00060\u0004R\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001e\u001a\u00060\u0004R\u00020\u0000*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001d\u001a\u00060\u0004R\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\u00020\u0017*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001d\u001a\u00060\u0004R\u00020\u0000H\u0002¢\u0006\u0004\b \u0010!J*\u0010%\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0010ø\u0001\u0000¢\u0006\u0004\b%\u0010&JA\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0,¢\u0006\u0004\b0\u00101J-\u00102\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b7\u00105R!\u0010<\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u001a8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010C\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010H\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u00105R(\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010D\u001a\u0004\bI\u0010F\"\u0004\bJ\u00105R(\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b6\u0010D\u001a\u0004\bK\u0010F\"\u0004\bL\u00105R*\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b4\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks;", "", "<init>", "()V", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "entry", "", "topLeft", "bottomRight", "currentMillis", "", "KN", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "nr", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V", "minDeadline", "t", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J", "", "Ik", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "Landroidx/collection/MutableIntObjectMap;", "", "key", "value", "ty", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "HI", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "screen", "window", "matrix", "o", "(JJ[F)Z", "id", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "callback", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "ck", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "Uo", "(IJJJ)V", "J2", "(J)V", "O", "r", c.f62177j, "Landroidx/collection/MutableIntObjectMap;", "mUb", "()Landroidx/collection/MutableIntObjectMap;", "rectChangedMap", "rl", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getGlobalChangeEntries", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setGlobalChangeEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "globalChangeEntries", "J", "xMQ", "()J", "setMinDebounceDeadline", "minDebounceDeadline", "az", "setWindowOffset--gyyYBs", "gh", "setScreenOffset--gyyYBs", "[F", "qie", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "Entry", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n405#1,6:495\n395#1:501\n396#1,6:518\n402#1:531\n387#1,3:532\n390#1,3:540\n395#1:543\n396#1,6:560\n402#1:573\n387#1,6:574\n397#2,3:502\n354#2,6:505\n364#2,3:512\n367#2,2:516\n370#2,6:524\n400#2:530\n397#2,3:544\n354#2,6:547\n364#2,3:554\n367#2,2:558\n370#2,6:566\n400#2:572\n397#2,3:580\n354#2,6:583\n364#2,3:590\n367#2,9:594\n400#2:603\n1399#3:511\n1270#3:515\n1399#3:553\n1270#3:557\n1399#3:589\n1270#3:593\n54#4:535\n59#4:537\n85#5:536\n90#5:538\n787#6:539\n679#7:604\n1#8:605\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n*L\n172#1:495,6\n182#1:501\n182#1:518,6\n182#1:531\n198#1:532,3\n198#1:540,3\n227#1:543\n227#1:560,6\n227#1:573\n238#1:574,6\n182#1:502,3\n182#1:505,6\n182#1:512,3\n182#1:516,2\n182#1:524,6\n182#1:530\n227#1:544,3\n227#1:547,6\n227#1:554,3\n227#1:558,2\n227#1:566,6\n227#1:572\n395#1:580,3\n395#1:583,6\n395#1:590,3\n395#1:594,9\n395#1:603\n182#1:511\n182#1:515\n227#1:553\n227#1:557\n395#1:589\n395#1:593\n206#1:535\n206#1:537\n206#1:536\n206#1:538\n206#1:539\n413#1:604\n413#1:605\n*E\n"})
public final class ThrottledCallbacks {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long screenOffset;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private long windowOffset;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Entry globalChangeEntries;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableIntObjectMap rectChangedMap = IntObjectMapKt.t();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long minDebounceDeadline = -1;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u00100\u001a\b\u0018\u00010\u0000R\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001d\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u00103R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b \u0010\u001f\"\u0004\b4\u00103R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b5\u00103R\"\u00108\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b7\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "callback", "<init>", "(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)V", c.f62177j, "()V", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "rl", "(JJJJ[F)V", "I", "getId", "()I", "J", "xMQ", "()J", "t", "nr", "Landroidx/compose/ui/node/DelegatableNode;", "KN", "()Landroidx/compose/ui/node/DelegatableNode;", "O", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "J2", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "Uo", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "ty", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "next", "mUb", "HI", "(J)V", "gh", "qie", "lastInvokeMillis", "az", "lastUninvokedFireMillis", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Entry implements DelegatableNode.RegistrationHandle {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private Entry next;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private long bottomRight;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final Function1 callback;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private long topLeft;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private long lastUninvokedFireMillis = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final DelegatableNode node;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final long throttleMillis;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final long debounceMillis;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private long lastInvokeMillis;

        public Entry(int i2, long j2, long j3, DelegatableNode delegatableNode, Function1 function1) {
            this.id = i2;
            this.throttleMillis = j2;
            this.debounceMillis = j3;
            this.node = delegatableNode;
            this.callback = function1;
            this.lastInvokeMillis = -j2;
        }

        public final void HI(long j2) {
            this.topLeft = j2;
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        /* JADX INFO: renamed from: KN, reason: from getter */
        public final DelegatableNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        /* JADX INFO: renamed from: Uo, reason: from getter */
        public final Entry getNext() {
            return this.next;
        }

        public final void az(long j2) {
            this.lastUninvokedFireMillis = j2;
        }

        public final void gh(long j2) {
            this.bottomRight = j2;
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final long getTopLeft() {
            return this.topLeft;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public void n() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (throttledCallbacks.HI(throttledCallbacks.getRectChangedMap(), this.id, this)) {
                return;
            }
            ThrottledCallbacks.this.Ik(this);
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final void qie(long j2) {
            this.lastInvokeMillis = j2;
        }

        public final void rl(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
            RelativeLayoutBounds relativeLayoutBoundsN = ThrottledCallbacksKt.n(this.node, topLeft, bottomRight, windowOffset, screenOffset, viewToWindowMatrix);
            if (relativeLayoutBoundsN == null) {
                return;
            }
            this.callback.invoke(relativeLayoutBoundsN);
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final void ty(Entry entry) {
            this.next = entry;
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final long getThrottleMillis() {
            return this.throttleMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Ik(Entry entry) {
        Entry entry2 = this.globalChangeEntries;
        if (entry2 == entry) {
            this.globalChangeEntries = entry2.getNext();
            entry.ty(null);
            return true;
        }
        Entry next = entry2 != null ? entry2.getNext() : null;
        while (true) {
            Entry entry3 = next;
            Entry entry4 = entry2;
            entry2 = entry3;
            if (entry2 == null) {
                return false;
            }
            if (entry2 == entry) {
                if (entry4 != null) {
                    entry4.ty(entry2.getNext());
                }
                entry.ty(null);
                return true;
            }
            next = entry2.getNext();
        }
    }

    private final void KN(Entry entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z2 = currentMillis - lastInvokeMillis >= throttleMillis;
        boolean z3 = debounceMillis == 0;
        boolean z4 = throttleMillis == 0;
        entry.HI(topLeft);
        entry.gh(bottomRight);
        boolean z5 = !(z3 || z4) || z3;
        if (z2 && z5) {
            entry.az(-1L);
            entry.qie(currentMillis);
            entry.rl(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z3) {
                return;
            }
            entry.az(currentMillis);
            long j2 = this.minDebounceDeadline;
            long j3 = currentMillis + debounceMillis;
            if (j2 <= 0 || j3 >= j2) {
                return;
            }
            this.minDebounceDeadline = j2;
        }
    }

    private final void nr(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis) {
        boolean z2 = currentMillis - entry.getLastInvokeMillis() > entry.getThrottleMillis();
        boolean z3 = entry.getDebounceMillis() == 0;
        entry.az(currentMillis);
        if (z2 && z3) {
            entry.qie(currentMillis);
            entry.rl(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        }
        if (z3) {
            return;
        }
        long j2 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + currentMillis;
        if (j2 <= 0 || debounceMillis >= j2) {
            return;
        }
        this.minDebounceDeadline = j2;
    }

    private final long t(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis, long minDeadline) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return minDeadline;
        }
        if (currentMillis - entry.getLastUninvokedFireMillis() <= entry.getDebounceMillis()) {
            return Math.min(minDeadline, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
        }
        entry.qie(currentMillis);
        entry.az(-1L);
        entry.rl(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        return minDeadline;
    }

    public final void J2(long currentMillis) {
        ThrottledCallbacks throttledCallbacks = this;
        long j2 = throttledCallbacks.windowOffset;
        long j3 = throttledCallbacks.screenOffset;
        float[] fArr = throttledCallbacks.viewToWindowMatrix;
        MutableIntObjectMap mutableIntObjectMap = throttledCallbacks.rectChangedMap;
        Object[] objArr = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr[i2];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                long j5 = j4;
                int i5 = 0;
                while (i5 < i3) {
                    if ((j5 & 255) < 128) {
                        Entry next = (Entry) objArr[(i2 << 3) + i5];
                        while (next != null) {
                            int i7 = i5;
                            Entry entry = next;
                            throttledCallbacks.nr(entry, j2, j3, fArr, currentMillis);
                            next = entry.getNext();
                            throttledCallbacks = this;
                            i5 = i7;
                        }
                    }
                    j5 >>= 8;
                    i5++;
                    throttledCallbacks = this;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            }
            i2++;
            throttledCallbacks = this;
        }
    }

    public final void O(long currentMillis) {
        long j2 = this.windowOffset;
        long j3 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry next = entry; next != null; next = next.getNext()) {
                LayoutNode layoutNodeHI = DelegatableNodeKt.HI(next.getNode());
                long offsetFromRoot = layoutNodeHI.getOffsetFromRoot();
                long lastSize = layoutNodeHI.getLastSize();
                next.HI(offsetFromRoot);
                next.gh((((long) (IntOffset.gh(offsetFromRoot) + ((int) (lastSize >> 32)))) << 32) | (((long) (IntOffset.qie(offsetFromRoot) + ((int) (lastSize & 4294967295L)))) & 4294967295L));
                nr(next, j2, j3, fArr, currentMillis);
            }
        }
    }

    public final void Uo(int id, long topLeft, long bottomRight, long currentMillis) {
        for (Entry next = (Entry) this.rectChangedMap.rl(id); next != null; next = next.getNext()) {
            KN(next, topLeft, bottomRight, currentMillis);
        }
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final long getWindowOffset() {
        return this.windowOffset;
    }

    public final DelegatableNode.RegistrationHandle ck(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1 callback) {
        return ty(this.rectChangedMap, id, new Entry(id, throttleMillis, debounceMillis == 0 ? throttleMillis : debounceMillis, node, callback));
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final long getScreenOffset() {
        return this.screenOffset;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final MutableIntObjectMap getRectChangedMap() {
        return this.rectChangedMap;
    }

    public final boolean o(long screen, long window, float[] matrix) {
        boolean z2;
        if (IntOffset.mUb(window, this.windowOffset)) {
            z2 = false;
        } else {
            this.windowOffset = window;
            z2 = true;
        }
        if (!IntOffset.mUb(screen, this.screenOffset)) {
            this.screenOffset = screen;
            z2 = true;
        }
        if (matrix == null) {
            return z2;
        }
        this.viewToWindowMatrix = matrix;
        return true;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final float[] getViewToWindowMatrix() {
        return this.viewToWindowMatrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[LOOP:0: B:8:0x0023->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[EDGE_INSN: B:39:0x0096->B:27:0x0096 BREAK  A[LOOP:0: B:8:0x0023->B:25:0x008c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(long currentMillis) {
        long j2;
        long jT2;
        int i2;
        if (this.minDebounceDeadline > currentMillis) {
            return;
        }
        long j3 = this.windowOffset;
        long j4 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        MutableIntObjectMap mutableIntObjectMap = this.rectChangedMap;
        Object[] objArr = mutableIntObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            jT2 = Long.MAX_VALUE;
            while (true) {
                long j5 = jArr[i3];
                j2 = Long.MAX_VALUE;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    long j6 = j5;
                    int i7 = 0;
                    while (i7 < i5) {
                        if ((j6 & 255) < 128) {
                            Entry next = (Entry) objArr[(i3 << 3) + i7];
                            while (next != null) {
                                int i8 = i3;
                                Entry entry = next;
                                jT2 = t(entry, j3, j4, fArr, currentMillis, jT2);
                                i7 = i7;
                                next = entry.getNext();
                                i3 = i8;
                            }
                            i2 = i7;
                        } else {
                            i2 = i7;
                        }
                        j6 >>= 8;
                        i7 = i2 + 1;
                        i3 = i3;
                    }
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i3 = i9;
                    if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (i3 != length) {
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
            jT2 = Long.MAX_VALUE;
        }
        Entry next2 = this.globalChangeEntries;
        if (next2 != null) {
            long jT3 = jT2;
            while (next2 != null) {
                jT3 = t(next2, j3, j4, fArr, currentMillis, jT3);
                next2 = next2.getNext();
            }
            jT2 = jT3;
        }
        if (jT2 == j2) {
            jT2 = -1;
        }
        this.minDebounceDeadline = jT2;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public ThrottledCallbacks() {
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.windowOffset = companion.rl();
        this.screenOffset = companion.rl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean HI(MutableIntObjectMap mutableIntObjectMap, int i2, Entry entry) {
        Entry next = (Entry) mutableIntObjectMap.HI(i2);
        if (next == null) {
            return false;
        }
        if (Intrinsics.areEqual(next, entry)) {
            Object next2 = entry.getNext();
            entry.ty(null);
            if (next2 != null) {
                mutableIntObjectMap.ty(i2, next2);
            }
            return true;
        }
        mutableIntObjectMap.ty(i2, next);
        while (true) {
            if (next == null) {
                break;
            }
            Entry next3 = next.getNext();
            if (next3 == null) {
                return false;
            }
            if (next3 == entry) {
                next.ty(entry.getNext());
                entry.ty(null);
                break;
            }
            next = next.getNext();
        }
    }

    private final Entry ty(MutableIntObjectMap mutableIntObjectMap, int i2, Entry entry) {
        Object objRl = mutableIntObjectMap.rl(i2);
        if (objRl == null) {
            mutableIntObjectMap.r(i2, entry);
            objRl = entry;
        }
        Entry next = (Entry) objRl;
        if (next != entry) {
            while (next.getNext() != null) {
                next = next.getNext();
                Intrinsics.checkNotNull(next);
            }
            next.ty(entry);
        }
        return entry;
    }
}
