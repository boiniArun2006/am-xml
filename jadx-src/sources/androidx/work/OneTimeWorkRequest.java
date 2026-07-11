package androidx.work;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class OneTimeWorkRequest extends WorkRequest {

    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.WorkRequest.Builder
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public Builder nr() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.WorkRequest.Builder
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public OneTimeWorkRequest t() {
            if (this.f42760n && this.f42761t.mUb.KN()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new OneTimeWorkRequest(this);
        }

        public Builder(Class cls) {
            super(cls);
            this.f42761t.nr = OverwritingInputMerger.class.getName();
        }
    }

    OneTimeWorkRequest(Builder builder) {
        super(builder.rl, builder.f42761t, builder.nr);
    }

    public static OneTimeWorkRequest nr(Class cls) {
        return (OneTimeWorkRequest) new Builder(cls).rl();
    }
}
