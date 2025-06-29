package cityhospital.exceptions;

public class PatientDetailsNotFoundException extends Exception {
    public PatientDetailsNotFoundException() {
        super();
    }

    public PatientDetailsNotFoundException(String message) {
        super(message);
    }

    public PatientDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PatientDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    protected PatientDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
