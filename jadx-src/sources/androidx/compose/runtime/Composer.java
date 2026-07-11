package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 62\u00020\u0001:\u0002\u0082\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b\u001b\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H'¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0004H'¢\u0006\u0004\b!\u0010\bJ#\u0010$\u001a\u00020\u0004\"\u0004\b\u0000\u0010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H'¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H'¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0004H'¢\u0006\u0004\b'\u0010\bJ!\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b(\u0010\rJ\u000f\u0010)\u001a\u00020\u0004H'¢\u0006\u0004\b)\u0010\bJB\u0010.\u001a\u00020\u0004\"\u0004\b\u0000\u0010*\"\u0004\b\u0001\u0010!2\u0006\u0010\u0017\u001a\u00028\u00002\u001d\u0010-\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040+¢\u0006\u0002\b,H'¢\u0006\u0004\b.\u0010/J\u0011\u00100\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001cH\u0017¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u000208H\u0017¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020=H\u0017¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020@H\u0017¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\bC\u00105J\u0017\u0010F\u001a\u00020\u00042\u0006\u0010E\u001a\u00020DH'¢\u0006\u0004\bF\u0010GJ\u001f\u0010J\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u0002H'¢\u0006\u0004\bJ\u0010KJ\u001d\u0010M\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040\"H'¢\u0006\u0004\bM\u0010%J#\u0010O\u001a\u00028\u0000\"\u0004\b\u0000\u0010!2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000NH'¢\u0006\u0004\bO\u0010PJ#\u0010T\u001a\u00020\u00042\u0012\u0010S\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030R0QH'¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0004H'¢\u0006\u0004\bV\u0010\bJ\u001b\u0010W\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030RH'¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0004H'¢\u0006\u0004\bY\u0010\bJ\u000f\u0010Z\u001a\u00020\u0004H&¢\u0006\u0004\bZ\u0010\bJ\u000f\u0010\\\u001a\u00020[H'¢\u0006\u0004\b\\\u0010]R\u001e\u0010b\u001a\u0006\u0012\u0002\b\u00030^8&X§\u0004¢\u0006\f\u0012\u0004\ba\u0010\b\u001a\u0004\b_\u0010`R\u001a\u0010f\u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\be\u0010\b\u001a\u0004\bc\u0010dR\u001a\u0010i\u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\bh\u0010\b\u001a\u0004\bg\u0010dR\u001a\u0010l\u001a\u00020\u001c8&X§\u0004¢\u0006\f\u0012\u0004\bk\u0010\b\u001a\u0004\bj\u0010dR\u001c\u0010p\u001a\u0004\u0018\u00010D8&X§\u0004¢\u0006\f\u0012\u0004\bo\u0010\b\u001a\u0004\bm\u0010nR\u001a\u0010t\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bs\u0010\b\u001a\u0004\bq\u0010rR\u0014\u0010x\u001a\u00020u8&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8&X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u001c\u0010\u0081\u0001\u001a\u00020}8gX§\u0004¢\u0006\r\u0012\u0005\b\u0080\u0001\u0010\b\u001a\u0004\b~\u0010\u007f\u0082\u0001\u0002\u0083\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0084\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "", "te", "(I)V", "M7", "()V", "eF", "Xw", "dataKey", "X", "(ILjava/lang/Object;)V", "P5", "e", "S", "KN", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "gh", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", "value", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "WPU", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "wTp", "", "changed", "Uo", "(Z)V", "qie", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "factory", "s7N", "(Lkotlin/jvm/functions/Function0;)V", "r", "XQ", "nHg", "g", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "az", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "iF", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "p5", "(Ljava/lang/Object;)Z", c.f62177j, "(Z)Z", "", "O", "(C)Z", "t", "(I)Z", "", "rl", "(F)Z", "", "nr", "(J)Z", "E2", "Landroidx/compose/runtime/RecomposeScope;", "scope", "bzg", "(Landroidx/compose/runtime/RecomposeScope;)V", "parametersChanged", "flags", "HI", "(ZI)Z", "effect", "aYN", "Landroidx/compose/runtime/CompositionLocal;", "ty", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", IV8ValueMap.FUNCTION_VALUES, "E", "([Landroidx/compose/runtime/ProvidedValue;)V", "v", "N", "(Landroidx/compose/runtime/ProvidedValue;)V", "Z", "ViF", "Landroidx/compose/runtime/CompositionContext;", "U", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "mUb", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "applier", "J2", "()Z", "getInserting$annotations", "inserting", "xMQ", "getSkipping$annotations", "skipping", "rV9", "getDefaultsInvalid$annotations", "defaultsInvalid", "nY", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "jB", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/CompositionLocalMap;", "Ik", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "Landroidx/compose/runtime/tooling/CompositionData;", "fD", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "ck", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Composer {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f30079n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "<init>", "()V", "rl", "Ljava/lang/Object;", c.f62177j, "()Ljava/lang/Object;", "Empty", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f30079n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        public final Object n() {
            return Empty;
        }

        private Companion() {
        }
    }

    void E(ProvidedValue[] values);

    boolean HI(boolean parametersChanged, int flags);

    CompositionLocalMap Ik();

    boolean J2();

    Composer KN(int key);

    void M7();

    void N(ProvidedValue value);

    void P5();

    void S();

    void T();

    CompositionContext U();

    void Uo(boolean changed);

    void ViF();

    void WPU(MovableContent value, Object parameter);

    void X(int key, Object dataKey);

    void XQ();

    void Xw();

    void Z();

    void aYN(Function0 effect);

    void az(Object value, Function2 block);

    void bzg(RecomposeScope scope);

    CoroutineContext ck();

    void e();

    void eF(int key);

    CompositionData fD();

    void g();

    ScopeUpdateScope gh();

    Object iF();

    int jB();

    Applier mUb();

    void nHg(int key, Object dataKey);

    RecomposeScope nY();

    void o(Object value);

    boolean p5(Object value);

    void qie();

    void r();

    boolean rV9();

    void s7N(Function0 factory);

    void te(int key);

    Object ty(CompositionLocal key);

    void v();

    void wTp();

    boolean xMQ();

    default boolean E2(Object value) {
        return p5(value);
    }

    default boolean O(char value) {
        return O(value);
    }

    default boolean n(boolean value) {
        return n(value);
    }

    default boolean nr(long value) {
        return nr(value);
    }

    default boolean rl(float value) {
        return rl(value);
    }

    default boolean t(int value) {
        return t(value);
    }
}
