package j$.time.temporal;

import j$.time.DayOfWeek;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class WeekFields implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ConcurrentHashMap f69143g = new ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TemporalUnit f69144h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DayOfWeek f69145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient p f69147c = t.e(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient p f69148d = t.h(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient p f69149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient p f69150f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        f(DayOfWeek.SUNDAY, 1);
        f69144h = i.f69162d;
    }

    public static WeekFields of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        return f(DayOfWeek.SUNDAY.s(r4.getFirstDayOfWeek() - 1), Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
    }

    public static WeekFields f(DayOfWeek dayOfWeek, int i2) {
        String str = dayOfWeek.toString() + i2;
        ConcurrentHashMap concurrentHashMap = f69143g;
        WeekFields weekFields = (WeekFields) concurrentHashMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentHashMap.putIfAbsent(str, new WeekFields(dayOfWeek, i2));
        return (WeekFields) concurrentHashMap.get(str);
    }

    private WeekFields(DayOfWeek dayOfWeek, int i2) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.f69149e = t.i(this);
        this.f69150f = t.g(this);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i2 < 1 || i2 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f69145a = dayOfWeek;
        this.f69146b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f69145a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i2 = this.f69146b;
        if (i2 < 1 || i2 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return f(this.f69145a, this.f69146b);
        } catch (IllegalArgumentException e2) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e2.getMessage());
        }
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f69145a;
    }

    public final int e() {
        return this.f69146b;
    }

    public final p d() {
        return this.f69147c;
    }

    public final p h() {
        return this.f69148d;
    }

    public final p i() {
        return this.f69149e;
    }

    public final p g() {
        return this.f69150f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f69145a.ordinal() * 7) + this.f69146b;
    }

    public final String toString() {
        return "WeekFields[" + this.f69145a + "," + this.f69146b + "]";
    }
}
