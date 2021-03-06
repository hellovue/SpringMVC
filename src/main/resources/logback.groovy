import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.util.FileSize

def logDir = "logs"
def byDay = "%d{yyyy-MM-dd}"
appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d | %highlight(%5level) | %boldYellow(%11.11thread) | %boldGreen(%25.25logger{5}) ---- %msg%n"
    }
}
appender("BACK", RollingFileAppender) {
    file = "${logDir}/spring-mvc.log"
    rollingPolicy(SizeAndTimeBasedRollingPolicy) {
        fileNamePattern = "${logDir}/log-archiver/${byDay}.%i.zipServletContextResources"
        maxHistory = 30
        maxFileSize = FileSize.valueOf("5MB")
        totalSizeCap = FileSize.valueOf("10MB")
    }
    encoder(PatternLayoutEncoder) {
        pattern = "%d |%11.11thread| %5level %25.25logger{5} - %msg%n"
    }
}
root(ALL, ["STDOUT"])
