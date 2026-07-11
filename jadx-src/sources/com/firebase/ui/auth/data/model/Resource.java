package com.firebase.ui.auth.data.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public final class Resource<T> {
    private final Exception mException;
    private boolean mIsUsed;
    private final State mState;
    private final T mValue;

    public boolean equals(Object obj) {
        T t3;
        if (this == obj) {
            return true;
        }
        if (obj != null && Resource.class == obj.getClass()) {
            Resource resource = (Resource) obj;
            if (this.mState == resource.mState && ((t3 = this.mValue) != null ? t3.equals(resource.mValue) : resource.mValue == null)) {
                Exception exc = this.mException;
                Exception exc2 = resource.mException;
                if (exc != null ? exc.equals(exc2) : exc2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final Exception getException() {
        this.mIsUsed = true;
        return this.mException;
    }

    @Nullable
    public T getValue() {
        this.mIsUsed = true;
        return this.mValue;
    }

    @NonNull
    public static <T> Resource<T> forFailure(@NonNull Exception exc) {
        return new Resource<>(State.FAILURE, null, exc);
    }

    @NonNull
    public static <T> Resource<T> forLoading() {
        return new Resource<>(State.LOADING, null, null);
    }

    @NonNull
    public static <T> Resource<T> forSuccess(@NonNull T t3) {
        return new Resource<>(State.SUCCESS, t3, null);
    }

    @NonNull
    public State getState() {
        return this.mState;
    }

    public int hashCode() {
        int iHashCode = this.mState.hashCode() * 31;
        T t3 = this.mValue;
        int iHashCode2 = (iHashCode + (t3 == null ? 0 : t3.hashCode())) * 31;
        Exception exc = this.mException;
        return iHashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public boolean isUsed() {
        return this.mIsUsed;
    }

    public String toString() {
        return "Resource{mState=" + this.mState + ", mValue=" + this.mValue + ", mException=" + this.mException + '}';
    }

    private Resource(State state, T t3, Exception exc) {
        this.mState = state;
        this.mValue = t3;
        this.mException = exc;
    }
}
