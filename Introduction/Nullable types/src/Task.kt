fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client(val personalInfo: PersonalInfo?) // 매개변수 ?를 통해 null 처리 -> 널이 들어갈 수 있음
class PersonalInfo(val email: String?) // 매개변수 ?를 통해 null 처리
interface Mailer {
    fun sendMessage(email: String, message: String)
}

/*
* JavaCode :
* public void sendMessageToClient(
    @Nullable Client client,
    @Nullable String message,
    @NotNull Mailer mailer
) {
    if (client == null || message == null) return;

    PersonalInfo personalInfo = client.getPersonalInfo();
    if (personalInfo == null) return;

    String email = personalInfo.getEmail();
    if (email == null) return;

    mailer.sendMessage(email, message);
}
* */