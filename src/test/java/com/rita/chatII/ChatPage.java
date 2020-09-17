package com.rita.chatII;

import com.rita.chatII.Model.ChatMessage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {

    @FindBy(id="messageText")
    private WebElement textField;

    @FindBy(id="submitMessage")
    private WebElement submitButton;

    @FindBy(id = "chatMessageUsername")
    private WebElement firstMessageUsername;

    @FindBy(id = "chatMessageText")
    private WebElement firstMessageText;

    public ChatPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void sendChatMessage(String text) {
        this.textField.sendKeys(text);
        this.submitButton.click();
    }

    public ChatMessage getFirstMessage() {
        ChatMessage result = new ChatMessage();
        result.setMsg(firstMessageText.getText());
        result.setName(firstMessageUsername.getText());
        return result;
    }

}

