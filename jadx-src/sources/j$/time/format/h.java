package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class h implements InterfaceC2193f {
    @Override // j$.time.format.InterfaceC2193f
    public final boolean q(y yVar, StringBuilder sb) {
        boolean z2;
        Long lE = yVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessorD = yVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessorD.g(aVar) ? Long.valueOf(yVar.d().h(aVar)) : null;
        int i2 = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iD0 = aVar.d0(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j2 = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j2, 315569520000L) + 1;
            LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(Math.floorMod(j2, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb.append('+');
                sb.append(jFloorDiv);
            }
            sb.append(localDateTimeOfEpochSecond);
            if (localDateTimeOfEpochSecond.L() == 0) {
                sb.append(":00");
            }
            z2 = true;
        } else {
            long j3 = jLongValue + 62167219200L;
            z2 = true;
            long j4 = j3 / 315569520000L;
            long j5 = j3 % 315569520000L;
            LocalDateTime localDateTimeOfEpochSecond2 = LocalDateTime.ofEpochSecond(j5 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeOfEpochSecond2);
            if (localDateTimeOfEpochSecond2.L() == 0) {
                sb.append(":00");
            }
            if (j4 < 0) {
                if (localDateTimeOfEpochSecond2.X() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j4 - 1));
                } else if (j5 == 0) {
                    sb.insert(length, j4);
                } else {
                    sb.insert(length + 1, Math.abs(j4));
                }
            }
        }
        if (iD0 > 0) {
            sb.append('.');
            int i3 = 100000000;
            while (true) {
                if (iD0 <= 0 && i2 % 3 == 0 && i2 >= -2) {
                    break;
                }
                int i5 = iD0 / i3;
                sb.append((char) (i5 + 48));
                iD0 -= i5 * i3;
                i3 /= 10;
                i2++;
            }
        }
        sb.append('Z');
        return z2;
    }

    @Override // j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        int i3;
        int i5;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder.n(aVar, 2);
        dateTimeFormatterBuilder.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.n(aVar2, 2);
        dateTimeFormatterBuilder.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.n(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i7 = 0;
        dateTimeFormatterBuilder.b(aVar4, 0, 9, true);
        dateTimeFormatterBuilder.e('Z');
        C2192e c2192eF = dateTimeFormatterBuilder.toFormatter().f();
        w wVarD = wVar.d();
        int iS = c2192eF.s(wVarD, charSequence, i2);
        if (iS < 0) {
            return iS;
        }
        long jLongValue = wVarD.j(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = wVarD.j(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = wVarD.j(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = wVarD.j(aVar).intValue();
        int iIntValue4 = wVarD.j(aVar2).intValue();
        Long lJ = wVarD.j(aVar3);
        Long lJ2 = wVarD.j(aVar4);
        int iIntValue5 = lJ != null ? lJ.intValue() : 0;
        int iIntValue6 = lJ2 != null ? lJ2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i3 = 0;
            i5 = iIntValue5;
            i7 = 1;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            wVar.p();
            i3 = iIntValue3;
            i5 = 59;
        } else {
            i3 = iIntValue3;
            i5 = iIntValue5;
        }
        try {
            return wVar.o(aVar4, iIntValue6, i2, wVar.o(j$.time.temporal.a.INSTANT_SECONDS, LocalDateTime.e0(((int) jLongValue) % 10000, iIntValue, iIntValue2, i3, iIntValue4, i5).h0(i7).toEpochSecond(ZoneOffset.UTC) + Math.multiplyExact(jLongValue / 10000, 315569520000L), i2, iS));
        } catch (RuntimeException unused) {
            return ~i2;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
