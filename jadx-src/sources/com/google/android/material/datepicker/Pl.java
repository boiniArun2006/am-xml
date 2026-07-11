package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class Pl {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pl f58932t = new Pl(null, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Long f58933n;
    private final TimeZone rl;

    static Pl t() {
        return f58932t;
    }

    Calendar n() {
        return rl(this.rl);
    }

    Calendar rl(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = this.f58933n;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        return calendar;
    }

    private Pl(Long l2, TimeZone timeZone) {
        this.f58933n = l2;
        this.rl = timeZone;
    }
}
