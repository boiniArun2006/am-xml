package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class InneractiveVideoError extends InneractiveError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Error f53538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f53539b;

    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);

        private String errorString;
        private boolean isFatal;

        public String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }

        Error(String str, boolean z2) {
            this.errorString = str;
            this.isFatal = z2;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f53538a = error;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        if (this.f53539b == null) {
            return this.f53538a.getErrorString();
        }
        return this.f53538a.getErrorString() + ": " + this.f53539b;
    }

    public Throwable getCause() {
        return this.f53539b;
    }

    public Error getPlayerError() {
        return this.f53538a;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.f53539b = th;
    }
}
