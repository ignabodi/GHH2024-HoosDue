
public class Message {
    private final String name;
    private final String feeling;
    private final String messageType;

    public Message(String name, String feeling, String messageType) {
        this.name = name;
        this.feeling = feeling;
        this.messageType = messageType;

    }

    public String getKindWords() {
        String message;
        switch (feeling.toLowerCase()) {
            case "happy":
                if (messageType.equals("comforted")) {
                    message = ", Keep your head up and remember all the greatness that you are capable of achieving! Your a women in STEM and that makes you unique, you are untouchable! Keep up the good work :)";
                }
                else {
                    message = ", Your energy is contagious, I can feel it through the screen! Uplift the people around you and remember that you are capable of more than you know in every aspect of life!";
                }
                break;
            case "angry":
                if (messageType.equals("comforted")) {
                    message = ", I am sorry your feeling put down, but remember that after every storm comes a rainbow :) this feeling will pass and its within your control! Go take a break, do something that fills your heart, we are human after all!";
                }
                else {
                    message = ", I am sorry your feeling angry, sometimes it helps to channel that feeling into other parts of life. Go run a mile, hug a tree, or sing your favorite song with all your chest! This feeling will pass, and its up to you to decide how.";
                }
                break;
            case "sad":
                if (messageType.equals("comforted")) {
                    message = ", I am sorry your feeling sad. Sometimes people just need a good cry. Let out your sadness in whichever way you can, talk to your family, write down what made you sad and how you can fix it, or get cozy and watch a movie. You are in control of your fate, you've got this girl!";
                }
                else {
                    message = ", I am sorry your feeling sad. Remember that this feeling will pass and you have full control over your fate. This emotion does not define you!";
                }
                break;
            case "anxious":
                if (messageType.equals("comforted")) {
                    message = ", Breath and remember that you can get through this! ";
                }
                else {
                    message = ", this isn't the first time you've been anxious and it definitely wont be the last. Get up and control the things you can, and let go of the things you cant.";
                }
                break;
            case "scared":
                if (messageType.equals("comforted")) {
                    message = ", I'm sorry you're scared, remember that with every darkness, theres is a light at the end of the tunnel.";
                }
                else {
                    message = ", we didn't come this far just to let a little fear bring us down";
                }
                break;
            case "excited":
                if (messageType.equals("comforted")) {
                    message = ", LETSS GOOOO KEEP THE BALL ROLLING!!!";
                }
                else {
                    message = ", OH MY GOD WHATS NEXT!!!";
                }
                break;
            case "good":
                if (messageType.equals("comforted")) {
                    message = ", keep doing the things you've been doing because they are what make you, you.";
                }
                else {
                    message = ", thats awesome! Dont stop working at getting better!";
                }
                break;
            case "bad":
                if (messageType.equals("comforted")) {
                    message = ", I'm sorry to hear that boo, just remember everything happens for a reason and like Katy Perry said --after a hurrican comes a rainbow :)";
                }
                else {
                    message = ", keep pushing and be the person who thought they couldn't but did, not the person who thought they could've but didnt.";
                }
                break;
            default:
                message = "try to describe your feeling in the way I suggested";
        }

        return name + message;
    }


}
