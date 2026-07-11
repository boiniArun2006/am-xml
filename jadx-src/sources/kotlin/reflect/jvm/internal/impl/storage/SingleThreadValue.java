package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class SingleThreadValue<T> {
    private final Thread thread = Thread.currentThread();
    private final T value;

    public boolean hasValue() {
        return this.thread == Thread.currentThread();
    }

    SingleThreadValue(T t3) {
        this.value = t3;
    }

    public T getValue() {
        if (hasValue()) {
            return this.value;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }
}
