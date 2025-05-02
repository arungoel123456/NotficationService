Requirements
1. The main job of this service is to send messages (notifications) to users.
2. The message can be sent through: Email, SMS, Push Notification (like app alerts). In the future, we should be able to add more options like WhatsApp or Slack.
3. A message can be sent in just one way (e.g., only email), or in multiple ways at the same time (e.g., email + SMS).
4. Some users may not want messages on certain channels. For example, a user may want only emails, not SMS.
5. Messages should follow a template. Example: "Hi Rahul, your order #1234 has been shipped." We’ll replace things like "Rahul" and "1234" at the time of sending.
6. If the message fails to send (e.g., email server is down), we should try again.
7. We should not send too many messages in a short time to the same user. For example, max 5 messages in 10 minutes.
8. Messages can be scheduled. For example, “Send this reminder tomorrow at 10 AM.”
9. Some messages are important (like OTP), others are not urgent (like offers). Important messages may be sent faster or retried sooner.


Checkout our course on System Design here: https://getsdeready.com/courses/design-combined/
Follow us on:
LinkedIn: https://www.linkedin.com/in/arungoel0810
Instagram: https://www.instagram.com/getsdeready/
