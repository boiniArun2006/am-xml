package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class C implements TemporalAccessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ZoneId f69008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Chronology f69009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f69010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private D f69011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ChronoLocalDate f69012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LocalTime f69013g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final HashMap f69007a = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    j$.time.o f69014h = j$.time.o.f69126d;

    C() {
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (this.f69007a.containsKey(pVar)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f69012f;
        if (chronoLocalDate != null && chronoLocalDate.g(pVar)) {
            return true;
        }
        LocalTime localTime = this.f69013g;
        if (localTime == null || !localTime.g(pVar)) {
            return (pVar == null || (pVar instanceof j$.time.temporal.a) || !pVar.a0(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        Objects.requireNonNull(pVar, "field");
        Long l2 = (Long) this.f69007a.get(pVar);
        if (l2 != null) {
            return l2.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f69012f;
        if (chronoLocalDate != null && chronoLocalDate.g(pVar)) {
            return this.f69012f.h(pVar);
        }
        LocalTime localTime = this.f69013g;
        if (localTime != null && localTime.g(pVar)) {
            return this.f69013g.h(pVar);
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
        return pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.g()) {
            return this.f69008b;
        }
        if (temporalQuery == j$.time.temporal.q.a()) {
            return this.f69009c;
        }
        if (temporalQuery == j$.time.temporal.q.b()) {
            ChronoLocalDate chronoLocalDate = this.f69012f;
            if (chronoLocalDate != null) {
                return LocalDate.C(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.c()) {
            return this.f69013g;
        }
        if (temporalQuery == j$.time.temporal.q.d()) {
            Long l2 = (Long) this.f69007a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                return ZoneOffset.ofTotalSeconds(l2.intValue());
            }
            ZoneId zoneId = this.f69008b;
            return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.q.f()) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.q.e()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void r(D d2) {
        long j2;
        long j3;
        HashMap map = this.f69007a;
        this.f69011e = d2;
        s();
        y(this.f69009c.U(map, this.f69011e));
        v();
        if (map.size() > 0) {
            int i2 = 0;
            loop0: while (i2 < 50) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    j$.time.temporal.p pVar = (j$.time.temporal.p) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorX = pVar.X(map, this, this.f69011e);
                    if (temporalAccessorX != null) {
                        if (temporalAccessorX instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorX;
                            ZoneId zoneId = this.f69008b;
                            if (zoneId == null) {
                                this.f69008b = chronoZonedDateTime.V();
                            } else if (!zoneId.equals(chronoZonedDateTime.V())) {
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.f69008b);
                            }
                            temporalAccessorX = chronoZonedDateTime.B();
                        }
                        if (temporalAccessorX instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorX;
                            x(chronoLocalDateTime.o(), j$.time.o.f69126d);
                            y(chronoLocalDateTime.p());
                        } else if (temporalAccessorX instanceof ChronoLocalDate) {
                            y((ChronoLocalDate) temporalAccessorX);
                        } else if (temporalAccessorX instanceof LocalTime) {
                            x((LocalTime) temporalAccessorX, j$.time.o.f69126d);
                        } else {
                            throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        }
                    } else if (!map.containsKey(pVar)) {
                        break;
                    }
                    i2++;
                }
            }
            if (i2 == 50) {
                throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i2 > 0) {
                s();
                y(this.f69009c.U(map, this.f69011e));
                v();
            }
        }
        if (this.f69013g == null) {
            j$.time.temporal.a aVar = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar)) {
                long jLongValue = ((Long) map.remove(aVar)).longValue();
                j$.time.temporal.a aVar2 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(aVar2)) {
                    long jLongValue2 = (((Long) map.get(aVar2)).longValue() % 1000) + (jLongValue * 1000);
                    A(aVar, aVar2, Long.valueOf(jLongValue2));
                    map.remove(aVar2);
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(obj)) {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) map.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l2 = (Long) map.get(obj2);
            if (l2 != null) {
                Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l5 = (Long) map.get(obj3);
                Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l6 = (Long) map.get(obj4);
                Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l7 = (Long) map.get(obj5);
                if ((l5 != null || (l6 == null && l7 == null)) && (l5 == null || l6 != null || l7 == null)) {
                    j3 = 0;
                    j2 = 1000000;
                    u(l2.longValue(), l5 != null ? l5.longValue() : 0L, l6 != null ? l6.longValue() : 0L, l7 != null ? l7.longValue() : 0L);
                    map.remove(obj2);
                    map.remove(obj3);
                    map.remove(obj4);
                    map.remove(obj5);
                } else {
                    j2 = 1000000;
                    j3 = 0;
                }
            } else {
                j2 = 1000000;
                j3 = 0;
            }
            if (this.f69011e != D.LENIENT && map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    j$.time.temporal.p pVar2 = (j$.time.temporal.p) entry.getKey();
                    if ((pVar2 instanceof j$.time.temporal.a) && ((j$.time.temporal.a) pVar2).f0()) {
                        ((j$.time.temporal.a) pVar2).e0(((Long) entry.getValue()).longValue());
                    }
                }
            }
        }
        ChronoLocalDate chronoLocalDate = this.f69012f;
        if (chronoLocalDate != null) {
            q(chronoLocalDate);
        }
        LocalTime localTime = this.f69013g;
        if (localTime != null) {
            q(localTime);
            if (this.f69012f != null && map.size() > 0) {
                q(this.f69012f.N(this.f69013g));
            }
        }
        if (this.f69012f != null && this.f69013g != null) {
            j$.time.o oVar = this.f69014h;
            oVar.getClass();
            j$.time.o oVar2 = j$.time.o.f69126d;
            if (oVar != oVar2) {
                this.f69012f = this.f69012f.Q(this.f69014h);
                this.f69014h = oVar2;
            }
        }
        if (this.f69013g == null && (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || map.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || map.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
            if (map.containsKey(aVar3)) {
                long jLongValue3 = ((Long) map.get(aVar3)).longValue();
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j2));
            } else {
                map.put(aVar3, Long.valueOf(j3));
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(j3));
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(j3));
            }
        }
        if (this.f69012f == null || this.f69013g == null) {
            return;
        }
        Long l8 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
        if (l8 != null) {
            map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(this.f69012f.N(this.f69013g).J(ZoneOffset.ofTotalSeconds(l8.intValue())).T()));
        } else if (this.f69008b != null) {
            map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(this.f69012f.N(this.f69013g).J(this.f69008b).T()));
        }
    }

    private void A(j$.time.temporal.p pVar, j$.time.temporal.a aVar, Long l2) {
        Long l5 = (Long) this.f69007a.put(aVar, l2);
        if (l5 == null || l5.longValue() == l2.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + aVar + " " + l5 + " differs from " + aVar + " " + l2 + " while resolving  " + pVar);
    }

    private void s() {
        HashMap map = this.f69007a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f69008b;
            if (zoneId != null) {
                t(zoneId);
                return;
            }
            Long l2 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                t(ZoneOffset.ofTotalSeconds(l2.intValue()));
            }
        }
    }

    private void t(ZoneId zoneId) {
        HashMap map = this.f69007a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        y(this.f69009c.y(Instant.C(((Long) map.remove(aVar)).longValue()), zoneId).p());
        A(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.o().toSecondOfDay()));
    }

    private void y(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f69012f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f69012f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.f69009c.equals(chronoLocalDate.i())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f69009c);
            }
            this.f69012f = chronoLocalDate;
        }
    }

    private void v() {
        HashMap map = this.f69007a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            D d2 = this.f69011e;
            if (d2 == D.STRICT || (d2 == D.SMART && jLongValue != 0)) {
                aVar.e0(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            A(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            D d4 = this.f69011e;
            if (d4 == D.STRICT || (d4 == D.SMART && jLongValue2 != 0)) {
                aVar3.e0(jLongValue2);
            }
            A(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.f69011e == D.LENIENT) {
                    A(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.e0(jLongValue3);
                    aVar5.e0(jLongValue3);
                    A(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.f69011e != D.LENIENT) {
                aVar6.e0(jLongValue5);
            }
            A(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            A(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            A(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            A(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.f69011e != D.LENIENT) {
                aVar7.e0(jLongValue6);
            }
            A(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            A(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.f69011e != D.LENIENT) {
                aVar8.e0(jLongValue7);
            }
            A(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            A(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.f69011e != D.LENIENT) {
                aVar9.e0(jLongValue8);
            }
            A(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            A(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            A(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.f69011e != D.LENIENT) {
                aVar10.e0(jLongValue9);
            }
            A(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            A(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            D d5 = this.f69011e;
            D d6 = D.LENIENT;
            if (d5 != d6) {
                aVar11.e0(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.f69011e != d6) {
                    aVar12.e0(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                A(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.f69011e != d6) {
                    aVar13.e0(jLongValue12);
                }
                A(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    u(((Long) map.remove(aVar14)).longValue(), ((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    private void u(long j2, long j3, long j4, long j5) {
        if (this.f69011e == D.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j2, 3600000000000L), Math.multiplyExact(j3, 60000000000L)), Math.multiplyExact(j4, 1000000000L)), j5);
            x(LocalTime.X(Math.floorMod(jAddExact, 86400000000000L)), j$.time.o.b((int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        int iD0 = j$.time.temporal.a.MINUTE_OF_HOUR.d0(j3);
        int iD02 = j$.time.temporal.a.NANO_OF_SECOND.d0(j5);
        if (this.f69011e == D.SMART && j2 == 24 && iD0 == 0 && j4 == 0 && iD02 == 0) {
            x(LocalTime.MIDNIGHT, j$.time.o.b(1));
        } else {
            x(LocalTime.of(j$.time.temporal.a.HOUR_OF_DAY.d0(j2), iD0, j$.time.temporal.a.SECOND_OF_MINUTE.d0(j4), iD02), j$.time.o.f69126d);
        }
    }

    private void x(LocalTime localTime, j$.time.o oVar) {
        LocalTime localTime2 = this.f69013g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.f69013g + " " + localTime);
            }
            j$.time.o oVar2 = this.f69014h;
            oVar2.getClass();
            j$.time.o oVar3 = j$.time.o.f69126d;
            if (oVar2 != oVar3 && oVar != oVar3 && !this.f69014h.equals(oVar)) {
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.f69014h + " " + oVar);
            }
            this.f69014h = oVar;
            return;
        }
        this.f69013g = localTime;
        this.f69014h = oVar;
    }

    private void q(TemporalAccessor temporalAccessor) {
        Iterator it = this.f69007a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.p pVar = (j$.time.temporal.p) entry.getKey();
            if (temporalAccessor.g(pVar)) {
                try {
                    long jH = temporalAccessor.h(pVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jH != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + pVar + " " + jH + " differs from " + pVar + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f69007a);
        sb.append(',');
        sb.append(this.f69009c);
        if (this.f69008b != null) {
            sb.append(',');
            sb.append(this.f69008b);
        }
        if (this.f69012f != null || this.f69013g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f69012f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.f69013g != null) {
                    sb.append('T');
                    sb.append(this.f69013g);
                }
            } else {
                sb.append(this.f69013g);
            }
        }
        return sb.toString();
    }
}
