package org.hibernate.internal.log;

import java.io.Serializable;
import javax.annotation.Generated;
import java.net.URISyntaxException;
import java.lang.String;
import org.jboss.logging.Logger;
import java.net.URL;
import java.lang.Exception;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2017-03-20T15:21:39-0700")
public class UrlMessageBundle_$logger implements UrlMessageBundle,Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = UrlMessageBundle_$logger.class.getName();
    public UrlMessageBundle_$logger(final Logger log) {
        this.log = log;
    }
    protected final Logger log;
    @Override
    public final void logMalformedUrl(final URL jarUrl, final URISyntaxException e) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, e, logMalformedUrl$str(), jarUrl);
    }
    private static final String logMalformedUrl = "HHH10000001: Malformed URL: %s";
    protected String logMalformedUrl$str() {
        return logMalformedUrl;
    }
    @Override
    public final void logUnableToFindFileByUrl(final URL url, final Exception e) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, e, logUnableToFindFileByUrl$str(), url);
    }
    private static final String logUnableToFindFileByUrl = "HHH10000002: File or directory named by URL [%s] could not be found.  URL will be ignored";
    protected String logUnableToFindFileByUrl$str() {
        return logUnableToFindFileByUrl;
    }
    @Override
    public final void logFileDoesNotExist(final URL url) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, logFileDoesNotExist$str(), url);
    }
    private static final String logFileDoesNotExist = "HHH10000003: File or directory named by URL [%s] did not exist.  URL will be ignored";
    protected String logFileDoesNotExist$str() {
        return logFileDoesNotExist;
    }
    @Override
    public final void logFileIsNotDirectory(final URL url) {
        log.logf(FQCN, org.jboss.logging.Logger.Level.WARN, null, logFileIsNotDirectory$str(), url);
    }
    private static final String logFileIsNotDirectory = "HHH10000004: Expecting resource named by URL [%s] to be a directory, but it was not.  URL will be ignored";
    protected String logFileIsNotDirectory$str() {
        return logFileIsNotDirectory;
    }
    private static final String fileDoesNotExist = "HHH10000005: File [%s] referenced by given URL [%s] does not exist";
    protected String fileDoesNotExist$str() {
        return fileDoesNotExist;
    }
    @Override
    public final String fileDoesNotExist(final String filePart, final URL url) {
        return String.format(fileDoesNotExist$str(), filePart, url);
    }
}
