package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0017\u0010\u0005R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0019\u0010\u0005\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "", "finalPosition", "<init>", "(F)V", "lastDisplacement", "lastVelocity", "", "timeElapsed", "Landroidx/compose/animation/core/Motion;", "J2", "(FFJ)J", c.f62177j, "F", "getFinalPosition", "()F", "nr", "", "rl", "D", "naturalFreq", "value", "t", "dampingRatio", "O", "stiffness", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n+ 2 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,152:1\n38#2:153\n53#3,3:154\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n*L\n149#1:153\n149#1:154,3\n*E\n"})
public final class SpringSimulation {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float finalPosition;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private double naturalFreq = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float dampingRatio = 1.0f;

    public final void t(float f3) {
        if (f3 < 0.0f) {
            PreconditionsKt.n("Damping ratio must be non-negative");
        }
        this.dampingRatio = f3;
    }

    public final long J2(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dExp;
        double dExp2;
        float f3 = lastDisplacement - this.finalPosition;
        double d2 = timeElapsed / 1000.0d;
        float f4 = this.dampingRatio;
        double d4 = ((double) f4) * ((double) f4);
        double d5 = this.naturalFreq;
        double d6 = ((double) (-f4)) * d5;
        if (f4 > 1.0f) {
            double dSqrt = d5 * Math.sqrt(d4 - ((double) 1));
            double d7 = d6 + dSqrt;
            double d8 = d6 - dSqrt;
            double d9 = f3;
            double d10 = ((d8 * d9) - ((double) lastVelocity)) / (d8 - d7);
            double d11 = d9 - d10;
            double d12 = d8 * d2;
            double d13 = d2 * d7;
            dExp2 = (Math.exp(d12) * d11) + (Math.exp(d13) * d10);
            dExp = (d11 * d8 * Math.exp(d12)) + (d10 * d7 * Math.exp(d13));
        } else if (f4 == 1.0f) {
            double d14 = f3;
            double d15 = ((double) lastVelocity) + (d5 * d14);
            double d16 = (-d5) * d2;
            double d17 = d14 + (d2 * d15);
            dExp2 = d17 * Math.exp(d16);
            dExp = (d17 * Math.exp(d16) * (-this.naturalFreq)) + (d15 * Math.exp(d16));
        } else {
            double d18 = 1;
            double dSqrt2 = d5 * Math.sqrt(d18 - d4);
            double d19 = f3;
            double d20 = (d18 / dSqrt2) * (((-d6) * d19) + ((double) lastVelocity));
            double d21 = dSqrt2 * d2;
            double d22 = d2 * d6;
            double dExp3 = Math.exp(d22) * ((Math.cos(d21) * d19) + (Math.sin(d21) * d20));
            dExp = (d6 * dExp3) + (Math.exp(d22) * (((-dSqrt2) * d19 * Math.sin(d21)) + (dSqrt2 * d20 * Math.cos(d21))));
            dExp2 = dExp3;
        }
        return Motion.n((((long) Float.floatToRawIntBits((float) dExp)) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp2 + ((double) this.finalPosition))) << 32));
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final void nr(float f3) {
        this.finalPosition = f3;
    }

    public final float rl() {
        double d2 = this.naturalFreq;
        return (float) (d2 * d2);
    }

    public SpringSimulation(float f3) {
        this.finalPosition = f3;
    }

    public final void O(float f3) {
        if (rl() <= 0.0f) {
            PreconditionsKt.n("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f3);
    }
}
