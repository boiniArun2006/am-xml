package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Person {
    boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f36315O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f36316n;
    String nr;
    IconCompat rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f36317t;

    @RequiresApi
    static class Api22Impl {
    }

    @RequiresApi
    static class Api28Impl {
        static Person n(android.app.Person person) {
            return new Builder().J2(person.getName()).t(person.getIcon() != null ? IconCompat.t(person.getIcon()) : null).Uo(person.getUri()).O(person.getKey()).rl(person.isBot()).nr(person.isImportant()).n();
        }

        static android.app.Person rl(Person person) {
            return new Person.Builder().setName(person.O()).setIcon(person.t() != null ? person.t().WPU() : null).setUri(person.J2()).setKey(person.nr()).setBot(person.Uo()).setImportant(person.KN()).build();
        }
    }

    public static class Builder {
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f36318O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        CharSequence f36319n;
        String nr;
        IconCompat rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        String f36320t;

        public Builder J2(CharSequence charSequence) {
            this.f36319n = charSequence;
            return this;
        }

        public Builder O(String str) {
            this.nr = str;
            return this;
        }

        public Builder Uo(String str) {
            this.f36320t = str;
            return this;
        }

        public Person n() {
            return new Person(this);
        }

        public Builder nr(boolean z2) {
            this.J2 = z2;
            return this;
        }

        public Builder rl(boolean z2) {
            this.f36318O = z2;
            return this;
        }

        public Builder t(IconCompat iconCompat) {
            this.rl = iconCompat;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String strNr = nr();
        String strNr2 = person.nr();
        return (strNr == null && strNr2 == null) ? Objects.equals(Objects.toString(O()), Objects.toString(person.O())) && Objects.equals(J2(), person.J2()) && Boolean.valueOf(Uo()).equals(Boolean.valueOf(person.Uo())) && Boolean.valueOf(KN()).equals(Boolean.valueOf(person.KN())) : Objects.equals(strNr, strNr2);
    }

    public static Person rl(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new Builder().J2(bundle.getCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME)).t(bundle2 != null ? IconCompat.rl(bundle2) : null).Uo(bundle.getString("uri")).O(bundle.getString("key")).rl(bundle.getBoolean("isBot")).nr(bundle.getBoolean("isImportant")).n();
    }

    public String J2() {
        return this.f36317t;
    }

    public boolean KN() {
        return this.J2;
    }

    public CharSequence O() {
        return this.f36316n;
    }

    public boolean Uo() {
        return this.f36315O;
    }

    public Bundle gh() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f36316n);
        IconCompat iconCompat = this.rl;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.S() : null);
        bundle.putString("uri", this.f36317t);
        bundle.putString("key", this.nr);
        bundle.putBoolean("isBot", this.f36315O);
        bundle.putBoolean("isImportant", this.J2);
        return bundle;
    }

    public String nr() {
        return this.nr;
    }

    public IconCompat t() {
        return this.rl;
    }

    public String xMQ() {
        String str = this.f36317t;
        if (str != null) {
            return str;
        }
        if (this.f36316n == null) {
            return "";
        }
        return "name:" + ((Object) this.f36316n);
    }

    Person(Builder builder) {
        this.f36316n = builder.f36319n;
        this.rl = builder.rl;
        this.f36317t = builder.f36320t;
        this.nr = builder.nr;
        this.f36315O = builder.f36318O;
        this.J2 = builder.J2;
    }

    public static Person n(android.app.Person person) {
        return Api28Impl.n(person);
    }

    public int hashCode() {
        String strNr = nr();
        if (strNr != null) {
            return strNr.hashCode();
        }
        return Objects.hash(O(), J2(), Boolean.valueOf(Uo()), Boolean.valueOf(KN()));
    }

    public android.app.Person mUb() {
        return Api28Impl.rl(this);
    }
}
