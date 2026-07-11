package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", "duration", "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class LongSaturatedMathKt {
    public static final boolean isSaturated(long j2) {
        return ((j2 - 1) | 1) == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m1752saturatingAddInHalvesNuflL3o(long j2, DurationUnit durationUnit, long j3) {
        long jM1655divUwyO8pc = Duration.m1655divUwyO8pc(j3, 2);
        long jM1691toLongimpl = Duration.m1691toLongimpl(jM1655divUwyO8pc, durationUnit);
        return (1 | (jM1691toLongimpl - 1)) == Long.MAX_VALUE ? jM1691toLongimpl : m1751saturatingAddNuflL3o(m1751saturatingAddNuflL3o(j2, durationUnit, jM1655divUwyO8pc), durationUnit, Duration.m1680minusLRDsOJo(j3, jM1655divUwyO8pc));
    }

    private static final long infinityOfSign(long j2) {
        return j2 < 0 ? Duration.INSTANCE.m1742getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m1741getINFINITEUwyO8pc();
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m1751saturatingAddNuflL3o(long j2, DurationUnit unit, long j3) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM1691toLongimpl = Duration.m1691toLongimpl(j3, unit);
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            return m1750checkInfiniteSumDefinedPjuGub4(j2, j3, jM1691toLongimpl);
        }
        if (((jM1691toLongimpl - 1) | 1) == Long.MAX_VALUE) {
            return m1752saturatingAddInHalvesNuflL3o(j2, unit, j3);
        }
        long j4 = j2 + jM1691toLongimpl;
        return ((j2 ^ j4) & (jM1691toLongimpl ^ j4)) < 0 ? j2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j4;
    }

    public static final long saturatingDiff(long j2, long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j3 - 1)) == Long.MAX_VALUE ? Duration.m1696unaryMinusUwyO8pc(infinityOfSign(j3)) : saturatingFiniteDiff(j2, j3, unit);
    }

    private static final long saturatingFiniteDiff(long j2, long j3, DurationUnit durationUnit) {
        long j4 = j2 - j3;
        if (((j4 ^ j2) & (~(j4 ^ j3))) >= 0) {
            return DurationKt.toDuration(j4, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m1696unaryMinusUwyO8pc(infinityOfSign(j4));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j5 = (j2 / jConvertDurationUnit) - (j3 / jConvertDurationUnit);
        long j6 = (j2 % jConvertDurationUnit) - (j3 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m1681plusLRDsOJo(DurationKt.toDuration(j5, durationUnit2), DurationKt.toDuration(j6, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j2, long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((j3 - 1) | 1) == Long.MAX_VALUE ? j2 == j3 ? Duration.INSTANCE.m1743getZEROUwyO8pc() : Duration.m1696unaryMinusUwyO8pc(infinityOfSign(j3)) : (1 | (j2 - 1)) == Long.MAX_VALUE ? infinityOfSign(j2) : saturatingFiniteDiff(j2, j3, unit);
    }

    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m1750checkInfiniteSumDefinedPjuGub4(long j2, long j3, long j4) {
        if (Duration.m1677isInfiniteimpl(j3) && (j2 ^ j4) < 0) {
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        return j2;
    }
}
