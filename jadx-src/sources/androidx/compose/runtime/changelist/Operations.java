package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.reference.V8ValueError;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0002GHB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e*\u00060\u0011R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u000e*\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u0003J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010$J\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0000¢\u0006\u0004\b(\u0010)J)\u00100\u001a\u00020\t2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0017¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u0010\u0010R\"\u00108\u001a\b\u0012\u0004\u0012\u00020!058\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b4\u00106\u0012\u0004\b7\u0010\u0003R\u0016\u0010;\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b \u0010=R\u0016\u0010?\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0015058\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0016\u0010B\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b&\u0010:R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010:R\u0011\u0010F\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "currentSize", "requiredSize", "O", "(II)I", "", "r", "ck", "(II)V", "Ik", "", "mUb", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "linePrefix", "nr", "(Landroidx/compose/runtime/changelist/Operations$OpIterator;Ljava/lang/String;)Ljava/lang/String;", "", "KN", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "o", "(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;", "", "gh", "()Z", "qie", "t", "Landroidx/compose/runtime/changelist/Operation;", "operation", "HI", "(Landroidx/compose/runtime/changelist/Operation;)V", "ty", "J2", InneractiveMediationNameConsts.OTHER, "az", "(Landroidx/compose/runtime/changelist/Operations;)V", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Uo", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "toString", "()Ljava/lang/String;", c.f62177j, "", "[Landroidx/compose/runtime/changelist/Operation;", "getOpCodes$runtime_release$annotations", "opCodes", "rl", "I", "opCodesSize", "", "[I", "intArgs", "intArgsSize", "[Ljava/lang/Object;", "objectArgs", "objectArgsSize", "pushedIntMask", "xMQ", "()I", "size", "OpIterator", "WriteScope", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n145#1,5:643\n158#1,5:648\n255#1:657\n255#1:658\n334#1,7:666\n325#1,16:673\n356#1:689\n356#1:690\n334#1,7:691\n27#2,2:653\n27#2,2:655\n27#2,2:664\n4658#3,4:659\n1#4:663\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n123#1:643,5\n124#1:648,5\n212#1:657\n213#1:658\n325#1:666,7\n347#1:673,16\n359#1:689\n362#1:690\n576#1:691,7\n141#1:653,2\n166#1:655,2\n295#1:664,2\n211#1:659,4\n*E\n"})
public final class Operations extends OperationsDebugStringFormattable {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public int objectArgsSize;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private int pushedIntMask;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public int intArgsSize;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public int opCodesSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Operation[] opCodes = new Operation[16];

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int[] intArgs = new int[16];

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public Object[] objectArgs = new Object[16];

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "<init>", "(Landroidx/compose/runtime/changelist/Operations;)V", "", "t", "()Z", "", "Landroidx/compose/runtime/changelist/IntParameter;", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "getInt", "(I)I", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", c.f62177j, "(I)Ljava/lang/Object;", "I", "opIdx", "rl", "intIdx", "objIdx", "Landroidx/compose/runtime/changelist/Operation;", "()Landroidx/compose/runtime/changelist/Operation;", "operation", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class OpIterator implements OperationArgContainer {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private int opIdx;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private int intIdx;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private int objIdx;

        public OpIterator() {
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt(int parameter) {
            return Operations.this.intArgs[this.intIdx + parameter];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public Object n(int parameter) {
            return Operations.this.objectArgs[this.objIdx + parameter];
        }

        public final Operation rl() {
            return Operations.this.opCodes[this.opIdx];
        }

        public final boolean t() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operationRl = rl();
            this.intIdx += operationRl.getInts();
            this.objIdx += operationRl.getObjects();
            int i2 = this.opIdx + 1;
            this.opIdx = i2;
            return i2 < Operations.this.opCodesSize;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJH\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013Jd\u0010\u0017\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0080\u0001\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0014\"\u0004\b\u0003\u0010\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u00072\u0006\u0010\u001b\u001a\u00028\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "Landroidx/compose/runtime/changelist/Operations;", V8ValueError.STACK, c.f62177j, "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "value", "", "nr", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "U", "parameter1", "value1", "parameter2", "value2", "O", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;)V", "V", "parameter3", "value3", "Uo", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "W", "parameter4", "value4", "J2", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "", "KN", "(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;", "", "t", "(Landroidx/compose/runtime/changelist/Operations;)I", InneractiveMediationNameConsts.OTHER, "", "rl", "(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/changelist/Operations;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n1#1,642:1\n356#2:643\n359#2:644\n356#2:645\n356#2:646\n356#2:647\n362#2:648\n356#2:649\n356#2:650\n356#2:651\n356#2:652\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n367#1:643\n378#1:644\n378#1:645\n396#1:646\n420#1:647\n436#1:648\n436#1:649\n454#1:650\n481#1:651\n513#1:652\n*E\n"})
    public static final class WriteScope {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Operations stack;

        public static String KN(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public static Operations n(Operations operations) {
            return operations;
        }

        public static boolean rl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && Intrinsics.areEqual(operations, ((WriteScope) obj).getStack());
        }

        public static int t(Operations operations) {
            return operations.hashCode();
        }

        public boolean equals(Object obj) {
            return rl(this.stack, obj);
        }

        public int hashCode() {
            return t(this.stack);
        }

        public String toString() {
            return KN(this.stack);
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final /* synthetic */ Operations getStack() {
            return this.stack;
        }

        public static final void J2(Operations operations, int i2, Object obj, int i3, Object obj2, int i5, Object obj3, int i7, Object obj4) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i2 + objects] = obj;
            objArr[i3 + objects] = obj2;
            objArr[i5 + objects] = obj3;
            objArr[objects + i7] = obj4;
        }

        public static final void O(Operations operations, int i2, Object obj, int i3, Object obj2) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i2 + objects] = obj;
            objArr[objects + i3] = obj2;
        }

        public static final void Uo(Operations operations, int i2, Object obj, int i3, Object obj2, int i5, Object obj3) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i2 + objects] = obj;
            objArr[i3 + objects] = obj2;
            objArr[objects + i5] = obj3;
        }

        public static final void nr(Operations operations, int i2, Object obj) {
            operations.objectArgs[(operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects()) + i2] = obj;
        }
    }

    public final void t() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        ArraysKt.fill(this.objectArgs, (Object) null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String KN(Object obj, String str) {
        return obj == null ? V8ValueNull.NULL : obj instanceof Object[] ? o(ArraysKt.asIterable((Object[]) obj), str) : obj instanceof int[] ? o(ArraysKt.asIterable((int[]) obj), str) : obj instanceof long[] ? o(ArraysKt.asIterable((long[]) obj), str) : obj instanceof float[] ? o(ArraysKt.asIterable((float[]) obj), str) : obj instanceof double[] ? o(ArraysKt.asIterable((double[]) obj), str) : obj instanceof Iterable ? o((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).n(str) : obj.toString();
    }

    private final int O(int currentSize, int requiredSize) {
        return RangesKt.coerceAtLeast(currentSize + RangesKt.coerceAtMost(currentSize, 1024), requiredSize);
    }

    private final String mUb(String str) {
        return str + "    ";
    }

    private final String o(Iterable iterable, final String str) {
        return CollectionsKt.joinToString$default(iterable, ", ", "[", "]", 0, null, new Function1<Object, CharSequence>() { // from class: androidx.compose.runtime.changelist.Operations$toCollectionString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Object obj) {
                return this.f30527n.KN(obj, str);
            }
        }, 24, null);
    }

    private final void r() {
        int iCoerceAtMost = RangesKt.coerceAtMost(this.opCodesSize, 1024);
        int i2 = this.opCodesSize;
        Operation[] operationArr = new Operation[iCoerceAtMost + i2];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i2);
        this.opCodes = operationArr;
    }

    public final void HI(Operation operation) {
        if (this.opCodesSize == this.opCodes.length) {
            r();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            ck(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            Ik(length2, objects);
        }
        Operation[] operationArr = this.opCodes;
        int i2 = this.opCodesSize;
        this.opCodesSize = i2 + 1;
        operationArr[i2] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    public final void J2(Operation operation) {
        int i2 = this.pushedIntMask;
        int ints = operation.getInts();
        if (i2 == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void az(Operations other) {
        Operation[] operationArr = this.opCodes;
        int i2 = this.opCodesSize - 1;
        this.opCodesSize = i2;
        Operation operation = operationArr[i2];
        operationArr[i2] = null;
        other.HI(operation);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = other.objectArgs;
        int objects = other.objectArgsSize - operation.getObjects();
        int objects2 = this.objectArgsSize - operation.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        ArraysKt.fill(this.objectArgs, (Object) null, this.objectArgsSize - operation.getObjects(), this.objectArgsSize);
        ArraysKt.copyInto(this.intArgs, other.intArgs, other.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgsSize);
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String n(String linePrefix) {
        StringBuilder sb = new StringBuilder();
        if (qie()) {
            OpIterator opIterator = new OpIterator();
            int i2 = 0;
            while (true) {
                sb.append(linePrefix);
                int i3 = i2 + 1;
                sb.append(i2);
                sb.append(". ");
                sb.append(nr(opIterator, linePrefix));
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                if (!opIterator.t()) {
                    break;
                }
                i2 = i3;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    private final void Ik(int currentSize, int requiredSize) {
        Object[] objArr = new Object[O(currentSize, requiredSize)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, currentSize);
        this.objectArgs = objArr;
    }

    private final void ck(int currentSize, int requiredSize) {
        int[] iArr = new int[O(currentSize, requiredSize)];
        ArraysKt.copyInto(this.intArgs, iArr, 0, 0, currentSize);
        this.intArgs = iArr;
    }

    private final String nr(OpIterator opIterator, String str) {
        Operation operationRl = opIterator.rl();
        if (operationRl.getInts() == 0 && operationRl.getObjects() == 0) {
            return operationRl.t();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(operationRl.t());
        sb.append('(');
        String strMUb = mUb(str);
        int ints = operationRl.getInts();
        boolean z2 = true;
        for (int i2 = 0; i2 < ints; i2++) {
            String strO = operationRl.O(i2);
            if (!z2) {
                sb.append(", ");
            } else {
                z2 = false;
            }
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(strMUb);
            sb.append(strO);
            sb.append(" = ");
            sb.append(opIterator.getInt(i2));
        }
        int objects = operationRl.getObjects();
        for (int i3 = 0; i3 < objects; i3++) {
            int iN = Operation.ObjectParameter.n(i3);
            String strJ2 = operationRl.J2(iN);
            if (!z2) {
                sb.append(", ");
            } else {
                z2 = false;
            }
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(strMUb);
            sb.append(strJ2);
            sb.append(" = ");
            sb.append(KN(opIterator.n(iN), strMUb));
        }
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void Uo(Applier applier, SlotWriter slots, RememberManager rememberManager) {
        if (qie()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.rl().n(opIterator, applier, slots, rememberManager);
            } while (opIterator.t());
        }
        t();
    }

    public final boolean gh() {
        if (getOpCodesSize() == 0) {
            return true;
        }
        return false;
    }

    public final boolean qie() {
        if (getOpCodesSize() != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }

    public final void ty(Operation operation) {
        HI(operation);
    }
}
