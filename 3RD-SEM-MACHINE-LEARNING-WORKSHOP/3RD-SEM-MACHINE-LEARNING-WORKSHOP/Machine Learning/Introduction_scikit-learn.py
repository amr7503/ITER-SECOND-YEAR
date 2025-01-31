import sklearn

#print(sklearn.__version__)  #pip install scikit-learn

from sklearn.datasets import load_iris    
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score

'''
load_iris: Function to load the Iris dataset, a well-known dataset in machine learning.
train_test_split: Function to split data into training and testing sets.
RandomForestClassifier: A machine learning algorithm for classification.
accuracy_score: Function to compute the accuracy of the model.
'''

# Load dataset
data = load_iris()
X, y = data.data, data.target
'''
load_iris(): Loads the Iris dataset.
X: Features (input data), i.e., measurements of the iris flowers.
y: Labels (target data), i.e., species of the iris flowers.
'''

# Split the data
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

'''
This splits the data into training and testing sets.
X_train: Training set features.
X_test: Testing set features.
y_train: Training set labels.
y_test: Testing set labels.
test_size=0.2: 20% of the data is used for testing, and 80% for training.
random_state=42: Ensures reproducibility of the split.
'''

# Train a classifier
clf = RandomForestClassifier()  # Initializes the Random Forest classifier.
clf.fit(X_train, y_train)       # Trains the classifier on the training data.

# Make predictions
y_pred = clf.predict(X_test)

'''
clf.predict(X_test): Uses the trained model to make predictions on the testing data.
y_pred: The predicted labels for the testing set.
'''

# Evaluate the model
print("Accuracy:", accuracy_score(y_test, y_pred))
'''
accuracy_score(y_test, y_pred): Computes the accuracy of the model by comparing the predicted labels (y_pred) with the actual labels (y_test).
print("Accuracy:", ...): Prints the accuracy of the model
'''

#OUTPUT
#Accuracy: 1.0
