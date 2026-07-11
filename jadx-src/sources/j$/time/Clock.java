package j$.time;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public abstract class Clock {
    public abstract ZoneId a();

    public abstract Instant instant();

    public static Clock systemUTC() {
        return a.f68933b;
    }

    public static Clock b() {
        return new a(ZoneId.systemDefault());
    }

    protected Clock() {
    }
}
