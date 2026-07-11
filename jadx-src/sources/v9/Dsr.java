package v9;

import java.nio.ShortBuffer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Dsr {

    static final class j extends RestrictedSuspendLambda implements Function2 {
        final /* synthetic */ int E2;
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f74670O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private /* synthetic */ Object f74671S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f74672Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ShortBuffer f74673g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74674n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f74675o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74676r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f74677t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ShortBuffer shortBuffer, int i2, Continuation continuation) {
            super(2, continuation);
            this.f74673g = shortBuffer;
            this.E2 = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f74673g, this.E2, continuation);
            jVar.f74671S = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
            return ((j) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
        
            if (r9.yield(r10, r11) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
        
            if (r9.yield(r1, r11) == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0084 -> B:16:0x0087). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i2;
            int i3;
            int i5;
            ShortBuffer shortBuffer;
            int i7;
            int i8;
            SequenceScope sequenceScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f74672Z;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        ResultKt.throwOnFailure(obj);
                        ShortBuffer shortBuffer2 = this.f74673g;
                        shortBuffer2.position(shortBuffer2.limit());
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = this.f74675o;
                i8 = this.f74676r;
                i2 = this.J2;
                i7 = this.f74670O;
                i3 = this.f74677t;
                shortBuffer = (ShortBuffer) this.f74674n;
                sequenceScope = (SequenceScope) this.f74671S;
                ResultKt.throwOnFailure(obj);
                i5++;
                if (i5 >= i2) {
                    shortBuffer.position((i8 * i5) + i7);
                    shortBuffer.limit(((i5 + 1) * i8) + i7);
                    ShortBuffer shortBufferSlice = shortBuffer.slice();
                    Intrinsics.checkNotNullExpressionValue(shortBufferSlice, "slice()");
                    this.f74671S = sequenceScope;
                    this.f74674n = shortBuffer;
                    this.f74677t = i3;
                    this.f74670O = i7;
                    this.J2 = i2;
                    this.f74676r = i8;
                    this.f74675o = i5;
                    this.f74672Z = 1;
                } else {
                    ShortBuffer shortBuffer3 = this.f74673g;
                    shortBuffer3.position(shortBuffer3.limit());
                    this.f74673g.limit(i3);
                    if (this.f74673g.hasRemaining()) {
                        ShortBuffer shortBufferSlice2 = this.f74673g.slice();
                        Intrinsics.checkNotNullExpressionValue(shortBufferSlice2, "slice()");
                        this.f74671S = null;
                        this.f74674n = null;
                        this.f74672Z = 2;
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.f74671S;
            int iLimit = this.f74673g.limit();
            int iPosition = this.f74673g.position();
            int iRemaining = this.f74673g.remaining();
            int i10 = this.E2;
            i2 = iRemaining / i10;
            i3 = iLimit;
            i5 = 0;
            shortBuffer = this.f74673g;
            i7 = iPosition;
            i8 = i10;
            sequenceScope = sequenceScope2;
            if (i5 >= i2) {
            }
            return coroutine_suspended;
        }
    }

    public static final Sequence n(ShortBuffer shortBuffer, int i2) {
        Intrinsics.checkNotNullParameter(shortBuffer, "<this>");
        return SequencesKt.sequence(new j(shortBuffer, i2, null));
    }

    public static final void rl(ShortBuffer shortBuffer, float f3) {
        Intrinsics.checkNotNullParameter(shortBuffer, "<this>");
        ShortBuffer shortBufferDuplicate = shortBuffer.duplicate();
        int iPosition = shortBuffer.position();
        int iRemaining = shortBuffer.remaining();
        for (int i2 = 0; i2 < iRemaining; i2++) {
            shortBuffer.put(Short.valueOf(I28.n((int) (shortBufferDuplicate.get() * f3))).shortValue());
        }
        shortBuffer.position(iPosition);
    }
}
